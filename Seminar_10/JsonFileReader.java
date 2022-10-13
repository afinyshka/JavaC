package Seminar_10;

public class JsonFileReader {
    public <E> E readObject(Class<E> type){
       
        if(type==int.class)
            return (E)((Object)4);
        else if(type.getSimpleName().contains("String"))
            return (E)((Object)"Hello");
        
    
        return null;
    }
}