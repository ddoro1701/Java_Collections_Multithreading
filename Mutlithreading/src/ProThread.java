class ProThread extends Thread {
    private Lager lager;

    ProThread(Lager lager) {
        super("Produzent");
        this.lager = lager;
    }

    @Override
    public void run() {
        while (lager.istOffen()) {
            lager.ergaenze((int) (5 + Math.random() * 100));
            try {
                Thread.sleep((int) (1000 + Math.random() * 3000));
            } catch (InterruptedException ie) {
                interrupt();
            }
        }
    }
}
