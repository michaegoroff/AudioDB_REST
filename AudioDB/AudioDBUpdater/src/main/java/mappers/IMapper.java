package mappers;

public interface IMapper <TEntity,TDto>{
    TEntity map(TDto dto);
    TEntity map(TEntity entity,TDto dto);
}
