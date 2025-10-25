public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        long inicio, fim;

        System.out.println(" TESTE DE DESEMPENHO (em milissegundos) ");

        // ------------------ BUBBLE SORT ------------------
        System.out.println(" Bubble Sort");
        inicio = System.nanoTime();
        BibleSort.bubbleSort(vetor1.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 1: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        BibleSort.bubbleSort(vetor2.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 2: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        BibleSort.bubbleSort(vetor3.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 3: %.3f ms%n%n", (fim - inicio) / 1_000_000.0);

        // ------------------ SELECTION SORT ------------------
        System.out.println(" Selection Sort");
        inicio = System.nanoTime();
        SelectSort.selectionSort(vetor1.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 1: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        SelectSort.selectionSort(vetor2.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 2: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        SelectSort.selectionSort(vetor3.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 3: %.3f ms%n%n", (fim - inicio) / 1_000_000.0);

        // ------------------ COCKTAIL SORT ------------------
        System.out.println(" Cocktail Sort");
        inicio = System.nanoTime();
        CocktailSort.cocktailSort(vetor1.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 1: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        CocktailSort.cocktailSort(vetor2.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 2: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        CocktailSort.cocktailSort(vetor3.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 3: %.3f ms%n%n", (fim - inicio) / 1_000_000.0);

        // ------------------ GNOME SORT ------------------
        System.out.println(" Gnome Sort");
        inicio = System.nanoTime();
        GnomeSort.gnomeSort(vetor1.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 1: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        GnomeSort.gnomeSort(vetor2.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 2: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        GnomeSort.gnomeSort(vetor3.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 3: %.3f ms%n%n", (fim - inicio) / 1_000_000.0);

        // ------------------ COMB SORT ------------------
        System.out.println(" Comb Sort");
        inicio = System.nanoTime();
        combSort.combSort(vetor1.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 1: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        combSort.combSort(vetor2.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 2: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        combSort.combSort(vetor3.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 3: %.3f ms%n%n", (fim - inicio) / 1_000_000.0);

        // ------------------ BUCKET SORT ------------------
        System.out.println(" Bucket Sort");
        inicio = System.nanoTime();
        BucketSort.bucketSort(vetor1.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 1: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        BucketSort.bucketSort(vetor2.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 2: %.3f ms%n", (fim - inicio) / 1_000_000.0);

        inicio = System.nanoTime();
        BucketSort.bucketSort(vetor3.clone());
        fim = System.nanoTime();
        System.out.printf("Vetor 3: %.3f ms%n%n", (fim - inicio) / 1_000_000.0);
    }
}
