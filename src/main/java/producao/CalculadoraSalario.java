package producao;

public class CalculadoraSalario {

    public Double getSalarioLiquido(Double bruto) {
        Double liquido = bruto - getDescontoInss(bruto) - getDescontoIr(bruto);

        return liquido;
    }

    // menos de 1000 -> 5%
    // 1000+ -> 10%
    private Double getDescontoInss(Double bruto) {
        return bruto < 1000 ? bruto * 0.05 : bruto * 0.10;
    }

    // menos de 1000 -> Isento
    // entre 1000 e 3000 -> 10%
    // mais de 3000 -> 20%
    private Double getDescontoIr(Double bruto) {
        return bruto < 1000 ? 0 : bruto <= 3000 ? bruto * 0.1 : bruto * 0.2;
    }



}
