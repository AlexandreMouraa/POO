public class MainItemss {

    public static void main(String[] args) {
        Item[] itens = new Item[10];

        itens[0] = new Filmess("Filme 1", 2021, 120, "Ótimo filme", "Diretor 1");
        itens[1] = new Filmess("Filme 2", 2020, 100, "Bom filme", "Diretor 2");
        itens[2] = new Filmess("Filme 3", 2019, 90, "Excelente filme", "Diretor 3");

        itens[3] = new CD("CD 1", 2021, 60, "Ótimo CD", "Artista 1", 12);
        itens[4] = new CD("CD 2", 2020, 45, "Bom CD", "Artista 2", 10);
        itens[5] = new CD("CD 3", 2019, 50, "Excelente CD", "Artista 3", 8);

        itens[6] = new Jogoss("Jogo 1", 2021, 120, "Ótimo jogo", 2, "PS4");
        itens[7] = new Jogoss("Jogo 2", 2020, 100, "Bom jogo", 4, "Xbox One");
        itens[8] = new Jogoss("Jogo 3", 2019, 90, "Excelente jogo", 1, "PC");

        itens[9] = new CD("CD 4", 2022, 55, "CD novo", "Artista 4", 15);

        for (Item item : itens) {
            item.mostrarDetalhes();
            System.out.println();
        }
    }
    
}
