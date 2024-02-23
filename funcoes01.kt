fun somarQuadrado(a: Int, b: Int): Int
    {//indica que o retono é para ser inteiro
        val quadradoA = a * a
        val quadradoB = b * b
        val soma = quadradoA + quadradoB;
        return soma;
    }


fun main (){
        val a = 3;
        val b = 4;

        val resultado = somarQuadrado(a, b)
        println("A soma dos quadrado de ${a} e ${b} é igual à ${resultado}.")
}