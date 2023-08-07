public class DataAlreadyExistsException extends Exception{
    public DataAlreadyExistsException(){
        super("Такой человек уже есть в базе данных");
    }
}
