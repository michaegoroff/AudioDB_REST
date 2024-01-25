package controllers;

import client.AudioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController implements IClientController{
    @Autowired
    AudioClient client;

    public ClientController(AudioClient client){
        this.client = client;
    }

    @GetMapping("/artist/{id}")
    public ResponseEntity getArtistById(@PathVariable("id") Long id){
        try {
            return ResponseEntity.ok(client.getArtistById(id));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/album/{id}")
    public ResponseEntity getAlbumById(@PathVariable("id") Long id){
        try{
            return ResponseEntity.ok(client.getAlbumById(id));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/track/{id}")
    public ResponseEntity getTrackById(@PathVariable("id") Long id){
        try{
            return ResponseEntity.ok(client.getTrackById(id));
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/allclips/{id}")
    public ResponseEntity getAllClipsByArtistId(@PathVariable("id") Long id){
        try{
            return ResponseEntity.ok(client.getAllClipsByArtistId(id));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/test")
    public ResponseEntity test(){
        return ResponseEntity.ok().build();
    }
}
