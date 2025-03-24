/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp.estga.utilslibrary;

import java.util.LinkedList;

/**
 *
 * @author Guyvânia Rosa
 * @param <T>
 */
public class LifoBuffer<T> {
    private LinkedList<T> buffer;

    public LifoBuffer() {
        buffer = new LinkedList<>();
    }

    public void adicionarElemento(T elemento) {
        buffer.addFirst(elemento);
    }

    public T removerElemento() {
        if (!buffer.isEmpty()) {
            T elementoRemovido = buffer.removeFirst();
            System.out.println("Elemento removido: " + elementoRemovido);
            return elementoRemovido;
        }
        return null; 
    }

    public void listarElementos() {
        for (T elemento : buffer) {
            System.out.println(elemento);
        }
    }
}