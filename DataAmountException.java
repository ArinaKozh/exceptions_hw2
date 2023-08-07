public class DataAmountException extends Exception{

    public DataAmountException(int given, int needed){
        super(String.format("Введено неверное количество данных. Вы ввели %d, введите %d данных", given, needed));
    }
}
