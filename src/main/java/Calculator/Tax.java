package Calculator;

/**
 * Класс рассчитывающий налог <br>
 * Наследуется от класса Calculation
 * @author Rinat_FN
 * @version 1.0
 * 
 */
public final class Tax extends Calculation{

    /** Процент налога */
    private int percent;

    /**
     * Конструктор класса
     *
     * @param percent передаваемый процент
     */
    public Tax(int percent) {
        this.percent = percent;
    }

    /**
     * Метод вычисляющий налог
     * Переопределен от суперкласса
     * @return количество изымаемого налога
     */
    @Override
    public long calc() {
        return super.netSalary * percent /100;
    }
}
