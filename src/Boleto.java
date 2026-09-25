import java.time.LocalDate;

public class Boleto extends FormasDePagamento {

    private LocalDate dataVencimento;

    public LocalDate getDataVencimento(){
        return dataVencimento = LocalDate.now().plusDays(10);
    }

    @Override
    public void processarPagamento() {
            IO.println("Seu Boleto foi gerado com sucesso!"
                    + "\n o código da operação é: "
                    + getCodigo() + "\n Data de Pagamento: "
                    + getDataCriacao()
                    + "\n A data de vencimento é: "
                    + getDataVencimento()
            );
    }
}
