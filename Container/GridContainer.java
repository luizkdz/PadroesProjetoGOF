package Container;

import java.util.Arrays;

public class GridContainer extends Container {

    private Component[][] elementsArray;
    
    private int altura;
    
    private int largura;

    private int contadorLinha;

    private int contadorColuna;

    

    public GridContainer(int altura, int largura) {
        elementsArray = new Component [altura][largura];
        this.altura = altura;
        this.largura = largura;
    }
    public GridContainer(int altura, int largura, Border border) {
        super(border);
        elementsArray = new Component [altura][largura];
        this.altura = altura;
        this.largura = largura;
    }

    public void addComponent(Component c){

        if(contadorLinha == altura && contadorColuna == largura ){
            System.out.println("O container está cheio, não é possível adicionar elementos");
        }
        else{
            elementsArray[contadorLinha][contadorColuna] = c;
            contadorColuna++;
            if(contadorColuna == largura){
                contadorLinha++;
                if(contadorLinha < altura){
                    contadorColuna = 0;
                }
            }
        }
        }
    


    @Override
    public void removeComponent(Component c) {
        for(contadorLinha = 0; contadorLinha <= altura; contadorLinha++){
            for(contadorColuna = 0;contadorColuna <= largura; contadorColuna++)
            {
                if(elementsArray[contadorLinha][contadorColuna] == c)
                elementsArray[contadorColuna][contadorLinha] = null;
            }
        }
    }


    @Override
    public void doLayout() {
        if(border != null){
            border.generateBorder();
        }
        System.out.println(Arrays.deepToString(elementsArray));
        System.out.println("Usando GridContainer");
    }
        
}
