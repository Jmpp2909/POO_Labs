public class AppStart {
    public static void main(String[] args) {
        // Selecionamos a instância MEDIUM do Enum
        Size size = Size.MEDIUM;

        // Apresentação dos dados conforme solicitado
        System.out.println("Name : " + size.name());
        System.out.println("toString() : \"" + size.toString() + "\"");
        System.out.println("Ordem : " + size.ordinal());
        System.out.println("Valor minimo : " + size.getMinValue());
        System.out.println("Valor maximo : " + size.getMaxValue());
        System.out.println("Código : '" + size.getCode() + "'");
    }
}
