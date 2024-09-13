package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adiocionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
            
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotaldeTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesdeTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotaldeTarefas());
        listaTarefa.adiocionarTarefa("tarefa 1");
        listaTarefa.adiocionarTarefa("tarefa 1");
        listaTarefa.adiocionarTarefa("tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotaldeTarefas());

        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotaldeTarefas());

        listaTarefa.obterDescricoesdeTarefas();
    }
}
