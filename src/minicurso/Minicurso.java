package minicurso;

import Enum.Cores;
import imageOpener.ImageOpener;

public class Minicurso {

    public static void main(String[] args) {
        
        Veiculo carro = new Veiculo(4, "Corsa", "MIC4582", Cores.VERMELHO.getNumero(), "Chevrolet", 1997);
        Veiculo carro1 = new Veiculo(4, "Gol", "GOL2010", Cores.BRANCO.getNumero(), "Volkswagen", 2010);
        System.out.println(carro.toString());
        System.out.println(carro1.toString());
        System.out.println(carro.ligar());
        System.out.println(carro.acelerar());
        System.out.println(carro.acelerar());
        System.out.println(carro.acelerar());
        System.out.println(carro.acelerar());
        System.out.println(carro1.acelerar());
        System.out.println(carro.acelerar());
        System.out.println(carro.acelerar());
        System.out.println(carro.acelerar());
        System.out.println(carro.desligar());
        System.out.println(carro1.desligar());
        System.out.println(carro.freiar());
        System.out.println(carro.freiar());
        System.out.println(carro.freiar());
        System.out.println(carro.freiar());
        System.out.println(carro.buzinar());
        System.out.println(carro.freiar());
        System.out.println(carro.freiar());
        System.out.println(carro.desligar());
        
        carro.exibir();
        carro1.exibir();
        
    }
    
}

class Veiculo {
    
    private String modelo;
    private String placa;
    private int cor;
    private String marca;
    private int ano;
    private int velocidade;
    private boolean ligado;
    private int portas;

    public Veiculo(int portas, String modelo, String placa, int cor, String marca, int ano) {
        this.portas = portas;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = 0;
        this.ligado = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public boolean isLigado(){
        return this.ligado;
    }
    
    public void aumentarVelocidade(){
        this.velocidade = this.velocidade + 20;
    }
    
    public void diminuirVelocidade(){
        this.velocidade = this.velocidade - 20;
    }
        
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    public void exibir() {
        switch (this.getCor()) {
            case 4 -> {
                if(this.getPortas() == 2){
                    ImageOpener imageOpener = new imageOpener.ImageOpener("amarelo 2.jpg");
                    imageOpener.setVisible(true); 
                } else {
                    ImageOpener imageOpener = new imageOpener.ImageOpener("amarelo 4.jpg");
                    imageOpener.setVisible(true); 
                }
            }
            case 1 -> {
                if(this.getPortas() == 2){
                    ImageOpener imageOpener = new imageOpener.ImageOpener("branco 2.jpg");
                    imageOpener.setVisible(true); 
                } else {
                    ImageOpener imageOpener = new imageOpener.ImageOpener("branco 4.jpg");
                    imageOpener.setVisible(true); 
                }
            }
            case 2 -> {
                if(this.getPortas() == 2){
                    ImageOpener imageOpener = new imageOpener.ImageOpener("vermelho 2.jpeg");
                    imageOpener.setVisible(true); 
                } else {
                    ImageOpener imageOpener = new imageOpener.ImageOpener("vermelho 4.jpg");
                    imageOpener.setVisible(true); 
                }
            }
            case 3 -> {
                if(this.getPortas() == 2){
                    ImageOpener imageOpener = new imageOpener.ImageOpener("preto 2.jpg");
                    imageOpener.setVisible(true); 
                } else {
                    ImageOpener imageOpener = new imageOpener.ImageOpener("preto 4.jpg");
                    imageOpener.setVisible(true); 
                }
            }
            case 5 -> {
                if(this.getPortas() == 2){
                    ImageOpener imageOpener = new imageOpener.ImageOpener("cinza 2.jpg");
                    imageOpener.setVisible(true); 
                } else {
                    ImageOpener imageOpener = new imageOpener.ImageOpener("cinza 4.jpg");
                    imageOpener.setVisible(true); 
                }
            }      
                
            default -> throw new AssertionError();
        }
    }

    public String acelerar() {
        if (this.getVelocidade() < 120){
            this.aumentarVelocidade();
            return "O carro "+getModelo()+" placa "+getPlaca()+" acelerou e está à "+getVelocidade()+"Km/h";
        } else {
            return "O carro "+getModelo()+" placa "+getPlaca()+" atingiu a velocidade máxima de 120 Km/h";
        }
    }

    public String freiar() {
        if(this.getVelocidade() > 0){
            this.diminuirVelocidade();
            return "O carro "+getModelo()+" placa "+getPlaca()+" freiou e está à "+getVelocidade()+"Km/h";
        } else {
            return "O carro "+getModelo()+" placa "+getPlaca()+" está parado.";
        }
    }

    public String buzinar() {
        return "O carro "+getModelo()+" placa "+getPlaca()+" buzinou (Bi Bi...)";
    }

    public String ligar() {
        if(this.isLigado()){
            return "O carro "+getModelo()+" placa "+getPlaca()+" Já está ligado.";
        }
        this.setLigado(true);
        return "O carro "+getModelo()+" placa "+getPlaca()+" ligou.";
    }

    public String desligar() {
        if(!this.isLigado() && this.getVelocidade() <= 0){
            return "O carro "+getModelo()+" placa "+getPlaca()+" Já está desligado.";
        }
        if(this.getVelocidade() > 0){
            return "O carro "+getModelo()+" placa "+getPlaca()+" Ainda está em movimento.";
            
        }
        this.setLigado(false);
        return "O carro "+getModelo()+" placa "+getPlaca()+" desligou";
    }
        
    @Override
    public String toString() {
        return "Marca: "+ getMarca()+", Modelo: "+getModelo()+" Placa: "+getPlaca()+" Cor:"+getCor()+ " Ano: "+getAno()+ " Portas: "+getPortas();
    }  
    
}