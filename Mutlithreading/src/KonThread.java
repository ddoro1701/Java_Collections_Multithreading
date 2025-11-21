class KonThread extends Thread {
    private Lager lager;

    KonThread(Lager lager) {
        super("Konsument");
        this.lager = lager;
    }
    
    @Override
    public void run() {
        while (lager.istOffen()) {
            lager.liefere((int) (5 + Math.random() * 100));
            try {
                Thread.sleep((int) (1000 + Math.random() * 3000));
            } catch (InterruptedException ie) {
                interrupt();
            }
        }
    }

}
