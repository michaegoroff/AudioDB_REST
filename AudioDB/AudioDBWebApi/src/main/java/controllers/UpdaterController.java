package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import updater.AudioUpdater;

@Controller
@RequestMapping("/updater")
public class UpdaterController implements IUpdaterController {
    @Autowired
    private AudioUpdater updater;

    public UpdaterController(AudioUpdater updater){
        this.updater = updater;
    }

    @GetMapping("albums/{name}")
    public ResponseEntity updateAllAlbumsByArtistName(@PathVariable("name") String name){
        try{
            updater.updateAllAlbumsByArtistName(name);
            return ResponseEntity.ok(name);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("allinfo/{id}")
    public ResponseEntity updateAllInfoByArtistId(@PathVariable("id") Long id){
        try{
            updater.updateAllInfoByArtistId(id);
            return ResponseEntity.ok(id);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }


}
