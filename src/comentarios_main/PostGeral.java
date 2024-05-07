package comentarios_main;

import comentarios_OO.Comentario;
import comentarios_OO.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PostGeral {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        Comentario c1 = new Comentario("Faça uma boa viagem! ");
        Comentario c2 = new Comentario("Como é incrível ");
        Post p1 = new Post (sdf.parse("21/06/2018 11:12:44"),
                "Bem vindo ao Brasil",
                "Estou vivendo num pai maravilhoso", 12);

        p1.addComentario(c1);
        p1.addComentario(c2);

        Comentario c3 = new Comentario("Boa noite, não tem como parar ! ");
        Comentario c4 = new Comentario("Flamengo é seleção! ");

        Post p2 = new Post (sdf.parse("21/06/2018 11:42:35"),
                "Flamengo é seleção? ",
                "Esse ano tem liberta oque acham ? ", 60);

        p2.addComentario(c3);
        p2.addComentario(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
