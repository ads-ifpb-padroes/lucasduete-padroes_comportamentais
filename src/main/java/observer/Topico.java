package observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Topico {

    private LocalDate date;
    private String assunto;
    private String conteudo;
    private List<Observer> observers;

    {
        date = LocalDate.now();
        observers = new ArrayList<>();
    }

    public Topico() {

    }

    public Topico(String assunto, String conteudo) {
        this.assunto = assunto;
        this.conteudo = conteudo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void publicar() {
        observers.forEach((observer -> observer.notificar()));
    }
}
