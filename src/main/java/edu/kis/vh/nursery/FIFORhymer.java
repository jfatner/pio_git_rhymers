package edu.kis.vh.nursery;

/**
 * Klasa reprezentujaca wyliczanke typu FIFO.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * Pomocnicza wyliczanka wykorzystywana do odwracania kolejnosci elementow.
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Usuwa i zwraca najstarszy element z wyliczanki (zgodnie z zasada FIFO).
     * * @return wartosc usunietego elementu
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }

}