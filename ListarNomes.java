import java.util.*;

void main(){

    List<String> nomes = new ArrayList<>(List.of(  //Cria uma lista de genero mutavel
            "Luca","Matteo","Sofia",
            "Carlos","Pierre","Julien",
            "Hans","Klaus","Oliver",
            "George","Erik","Lars",
            "Niels","Pieter","Jan",
            "Marek","Andrei","Ivan",
            "Nikola","Petar"));

    nomes.sort(null);                             //Coloca a lista de nomes em ordem alfabetica
    int i = 1;                                    //Indice contador para cada nome da lista
    for(String nome : nomes){                     //Contador usando "for" para percorrer cada nome na lista
        System.out.println(i++ +"° " + nome);
    }
}