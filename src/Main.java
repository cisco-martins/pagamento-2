void main() {

    IO.println("\n-----------Pagamento-----------\n");

    FormasDePagamento pix = new PagamentoPix();

    pix.processarPagamento();

    IO.println("\n-----------Pagamento-----------\n");
    pix.processarPagamento();

    FormasDePagamento boleto = new Boleto();

    IO.println("\n-----------Pagamento-----------\n");
    boleto.processarPagamento();


}
