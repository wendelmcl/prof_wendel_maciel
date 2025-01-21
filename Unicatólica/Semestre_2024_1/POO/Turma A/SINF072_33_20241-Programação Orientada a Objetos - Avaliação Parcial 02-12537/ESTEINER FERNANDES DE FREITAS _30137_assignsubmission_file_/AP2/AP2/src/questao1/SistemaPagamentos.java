package questao1;

class SistemaPagamentos {
    private ArrayList<FormaPagamento> formasPagamento;

    public SistemaPagamentos() {
        formasPagamento = new ArrayList<>();
    }

    public void adicionarFormaPagamento(FormaPagamento formaPagamento) {
        formasPagamento.add(formaPagamento);
    }

    public void processarPagamento(int indiceFormaPagamento) {
        FormaPagamento formaPagamento = formasPagamento.get(indiceFormaPagamento);
        formaPagamento.processarPagamento();
    }
}