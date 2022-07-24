package br.project.test.transferencias;

public enum TranferenciaType {
    PIX(0.0),
    DOC(0.22),
    TED(0.11);

    private Double taxa;
    TranferenciaType(double taxa) {
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }
}
