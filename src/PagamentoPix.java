public class PagamentoPix extends FormasDePagamento {
    @Override
    public void processarPagamento() {
        IO.println("Seu pix foi realizado com sucesso!"
                        + "\n o código da operação é: "
                        + getCodigo() + "\n Data de Pagamento: "
                        + getDataCriacao()
        );
    }
}
