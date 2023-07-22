import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    //Inicializando o container que conterá todos os JFrames e o layout de CardLayout
    JPanel panelContainer = new JPanel();
    CardLayout leiaute = new CardLayout();

    //Inicializando o JPanel de cada menu
    JPanel menuPrincipal = new JPanel();
    JPanel menuAdicionar = new JPanel();
    JPanel menuListar = new JPanel();
    JPanel menuRemover = new JPanel();
    JPanel menuResumo = new JPanel();
    JPanel menuAdicionarSmartphone = new JPanel();
    JPanel menuAdicionarLaptop = new JPanel();
    JPanel menuAdicionarMonitor = new JPanel();
    JPanel menuAdicionarTecladoBT = new JPanel();
    JPanel menuAdicionarFoneBT = new JPanel();

    //Botões do menu principal
    JButton buttonAdicionar = new JButton("Adicionar Produto ao Estoque");
    JButton buttonListar = new JButton("Listar Produtos no Estoque");
    JButton buttonRemover = new JButton("Remover Produto do Estoque");
    JButton buttonResumo = new JButton("Resumo dos Produtos em Estoque");
    JButton buttonFinalizar = new JButton("Finalizar Programa");

    //Cada menu após o menu principal precisa de um botão de voltar novo, pois só é possível utilizar cada um uma vez por JFrame
    JButton buttonMenu1 = new JButton("Retornar ao Menu");
    JButton buttonMenu2 = new JButton("Retornar ao Menu");
    JButton buttonMenu3 = new JButton("Retornar ao Menu");
    JButton buttonMenu4 = new JButton("Retornar ao Menu");

    //Botões do menu adicionar
    JButton adicionarSmartphone = new JButton("Smartphone");
    JButton enviarSmartphone = new JButton("Adicionar");
    JButton cancelarSmartphone = new JButton("Cancelar");

    JButton adicionarLaptop = new JButton("Laptop");
    JButton enviarLaptop = new JButton("Adicionar");
    JButton cancelarLaptop = new JButton("Cancelar");

    JButton adicionarMonitor = new JButton("Monitor");
    JButton enviarMonitor = new JButton("Adicionar");
    JButton cancelarMonitor = new JButton("Cancelar");

    JButton adicionarTecladoBT = new JButton("Teclado Bluetooth");
    JButton enviarTecladoBT = new JButton("Adicionar");
    JButton cancelarTecladoBT = new JButton("Cancelar");

    JButton adicionarFoneBT = new JButton("Fone Bluetooth");
    JButton enviarFoneBT = new JButton("Adicionar");
    JButton cancelarFoneBT = new JButton("Cancelar");

    Frame(){
        panelContainer.setLayout(leiaute);

        //BOTÕES NO MENU PRINCIPAL
        menuPrincipal.add(buttonAdicionar);
        menuPrincipal.add(buttonListar);
        menuPrincipal.add(buttonRemover);
        menuPrincipal.add(buttonResumo);
        menuPrincipal.add(buttonFinalizar);
        buttonFinalizar.addActionListener(this);

        //BOTÕES NO MENU ADICIONAR
        adicionarSmartphone.addActionListener(this);
        menuAdicionar.add(adicionarSmartphone);

        adicionarLaptop.addActionListener(this);
        menuAdicionar.add(adicionarLaptop);

        adicionarMonitor.addActionListener(this);
        menuAdicionar.add(adicionarMonitor);

        adicionarTecladoBT.addActionListener(this);
        menuAdicionar.add(adicionarTecladoBT);

        adicionarFoneBT.addActionListener(this);
        menuAdicionar.add(adicionarFoneBT);

        buttonMenu1.addActionListener(this);
        menuAdicionar.add(buttonMenu1);

        //ESPAÇOS DE PREENCHIMENTO DOS ITENS DO MENU ADICIONAR
        //SMARTPHONE
        //TITULO
        JPanel smartphoneBox0 = new JPanel();
        JLabel smartphoneTitulo = new JLabel("Adicionar Smartphone");

        smartphoneBox0.add(smartphoneTitulo);
        menuAdicionarSmartphone.add(smartphoneBox0);

        //PRIMEIRA LINHA
        JPanel smartphoneBox1 = new JPanel();
        JLabel nomeMarca = new JLabel("Marca:");
        JTextField marcaInput = new JTextField();
        marcaInput.setPreferredSize(new Dimension(180, 30));

        smartphoneBox1.add(nomeMarca);
        smartphoneBox1.add(marcaInput);

        menuAdicionarSmartphone.add(smartphoneBox1);

        //SEGUNDA LINHA
        JPanel box2 = new JPanel();
        JLabel nomeModelo = new JLabel("Modelo:");
        JTextField modeloInput = new JTextField();
        modeloInput.setPreferredSize(new Dimension(180, 30));

        box2.add(nomeModelo);
        box2.add(modeloInput);

        menuAdicionarSmartphone.add(box2);

        //TERCEIRA LINHA
        JPanel box3 = new JPanel();
        JLabel valorPreco = new JLabel("Preço:");
        JTextField precoInput = new JTextField();
        precoInput.setPreferredSize(new Dimension(180, 30));

        box3.add(valorPreco);
        box3.add(precoInput);

        menuAdicionarSmartphone.add(box3);

        //QUARTA LINHA
        JPanel box4 = new JPanel();

        enviarSmartphone.addActionListener(this);
        cancelarSmartphone.addActionListener(this);
        box4.add(enviarSmartphone);
        box4.add(cancelarSmartphone);

        menuAdicionarSmartphone.add(box4);

        //LAPTOP
        //TITULO
        JPanel laptopBox0 = new JPanel();
        JLabel laptopTitulo = new JLabel("Adicionar Laptop     ");

        laptopBox0.add(laptopTitulo);
        menuAdicionarLaptop.add(laptopBox0);

        //PRIMEIRA LINHA
        JPanel laptopBox1 = new JPanel();
        JLabel laptopNomeMarca = new JLabel("Marca:");
        JTextField laptopMarcaInput = new JTextField();
        laptopMarcaInput.setPreferredSize(new Dimension(180, 30));

        laptopBox1.add(laptopNomeMarca);
        laptopBox1.add(laptopMarcaInput);

        menuAdicionarLaptop.add(laptopBox1);

        //SEGUNDA LINHA
        JPanel laptopBox2 = new JPanel();
        JLabel laptopNomeModelo = new JLabel("Modelo:");
        JTextField laptopModeloInput = new JTextField();
        laptopModeloInput.setPreferredSize(new Dimension(180, 30));

        laptopBox2.add(laptopNomeModelo);
        laptopBox2.add(laptopModeloInput);

        menuAdicionarLaptop.add(laptopBox2);

        //TERCEIRA LINHA
        JPanel laptopBox3 = new JPanel();
        JLabel laptopTamanhoTela = new JLabel("Tamanho da Tela (em polegadas):");
        JTextField laptopTamanhoTelaInput = new JTextField();
        laptopTamanhoTelaInput.setPreferredSize(new Dimension(30, 30));

        laptopBox3.add(laptopTamanhoTela);
        laptopBox3.add(laptopTamanhoTelaInput);

        menuAdicionarLaptop.add(laptopBox3);

        //QUARTA LINHA
        JPanel laptopBox4 = new JPanel();
        JLabel laptopValorPreco = new JLabel("Preço:");
        JTextField laptopPrecoInput = new JTextField();
        laptopPrecoInput.setPreferredSize(new Dimension(180, 30));

        laptopBox4.add(laptopValorPreco);
        laptopBox4.add(laptopPrecoInput);

        menuAdicionarLaptop.add(laptopBox4);

        //QUINTA LINHA
        JPanel laptopBox5 = new JPanel();

        enviarLaptop.addActionListener(this);
        cancelarLaptop.addActionListener(this);
        laptopBox5.add(enviarLaptop);
        laptopBox5.add(cancelarLaptop);

        menuAdicionarLaptop.add(laptopBox5);

        //MONITOR
        //TITULO
        JPanel monitorBox0 = new JPanel();
        JLabel monitorTitulo = new JLabel("Adicionar Monitor    ");

        monitorBox0.add(monitorTitulo);
        menuAdicionarMonitor.add(monitorBox0);

        //PRIMEIRA LINHA
        JPanel monitorBox1 = new JPanel();
        JLabel monitorNomeMarca = new JLabel("Marca:");
        JTextField monitorMarcaInput = new JTextField();
        monitorMarcaInput.setPreferredSize(new Dimension(180, 30));

        monitorBox1.add(monitorNomeMarca);
        monitorBox1.add(monitorMarcaInput);

        menuAdicionarMonitor.add(monitorBox1);

        //SEGUNDA LINHA
        JPanel monitorBox2 = new JPanel();
        JLabel monitorNomeModelo = new JLabel("Modelo:");
        JTextField monitorModeloInput = new JTextField();
        monitorModeloInput.setPreferredSize(new Dimension(180, 30));

        monitorBox2.add(monitorNomeModelo);
        monitorBox2.add(monitorModeloInput);

        menuAdicionarMonitor.add(monitorBox2);

        //TERCEIRA LINHA
        JPanel monitorBox3 = new JPanel();
        JLabel monitorTamanhoTela = new JLabel("Tamanho da Tela (em polegadas):");
        JTextField monitorTamanhoTelaInput = new JTextField();
        monitorTamanhoTelaInput.setPreferredSize(new Dimension(30, 30));

        monitorBox3.add(monitorTamanhoTela);
        monitorBox3.add(monitorTamanhoTelaInput);

        menuAdicionarMonitor.add(monitorBox3);

        //QUARTA LINHA
        JPanel monitorBox4 = new JPanel();
        JLabel monitorValorPreco = new JLabel("Preço:");
        JTextField monitorPrecoInput = new JTextField();
        monitorPrecoInput.setPreferredSize(new Dimension(180, 30));

        monitorBox4.add(monitorValorPreco);
        monitorBox4.add(monitorPrecoInput);

        menuAdicionarMonitor.add(monitorBox4);

        //QUINTA LINHA
        JPanel monitorBox5 = new JPanel();

        enviarMonitor.addActionListener(this);
        cancelarMonitor.addActionListener(this);
        monitorBox5.add(enviarMonitor);
        monitorBox5.add(cancelarMonitor);

        menuAdicionarMonitor.add(monitorBox5);

        //TECLADO BLUETOOTH
        //TITULO
        JPanel tecladoBtBox0 = new JPanel();
        JLabel tecladoBtTitulo = new JLabel("Adicionar Teclado Bluetooth");

        tecladoBtBox0.add(tecladoBtTitulo);
        menuAdicionarTecladoBT.add(tecladoBtBox0);

        //PRIMEIRA LINHA
        JPanel tecladoBtBox1 = new JPanel();
        JLabel tecladoBtNomeMarca = new JLabel("Marca:");
        JTextField tecladoBtMarcaInput = new JTextField();
        tecladoBtMarcaInput.setPreferredSize(new Dimension(180, 30));

        tecladoBtBox1.add(tecladoBtNomeMarca);
        tecladoBtBox1.add(tecladoBtMarcaInput);

        menuAdicionarTecladoBT.add(tecladoBtBox1);

        //SEGUNDA LINHA
        JPanel tecladoBtBox2 = new JPanel();
        JLabel tecladoBtNomeModelo = new JLabel("Modelo:");
        JTextField tecladoBtModeloInput = new JTextField();
        tecladoBtModeloInput.setPreferredSize(new Dimension(180, 30));

        tecladoBtBox2.add(tecladoBtNomeModelo);
        tecladoBtBox2.add(tecladoBtModeloInput);

        menuAdicionarTecladoBT.add(tecladoBtBox2);

        //TERCEIRA LINHA
        JPanel tecladoBtBox3 = new JPanel();
        JLabel tecladoBtTamanhoTela = new JLabel("Tipo:");
        JTextField tecladoBtTamanhoTelaInput = new JTextField();
        tecladoBtTamanhoTelaInput.setPreferredSize(new Dimension(180, 30));

        tecladoBtBox3.add(tecladoBtTamanhoTela);
        tecladoBtBox3.add(tecladoBtTamanhoTelaInput);

        menuAdicionarTecladoBT.add(tecladoBtBox3);

        //QUARTA LINHA
        JPanel tecladoBtBox4 = new JPanel();
        JLabel tecladoBtRGB = new JLabel("É RGB?");
        JTextField tecladoBtRgbInput = new JTextField();
        tecladoBtRgbInput.setPreferredSize(new Dimension(30, 30));

        tecladoBtBox4.add(tecladoBtRGB);
        tecladoBtBox4.add(tecladoBtRgbInput);

        menuAdicionarTecladoBT.add(tecladoBtBox4);

        //QUINTA LINHA
        JPanel tecladoBtBox5 = new JPanel();
        JLabel tecladoBtAutonomia = new JLabel("Autonomia da bateria (em horas):");
        JTextField tecladoBtAutonomiaInput = new JTextField();
        tecladoBtAutonomiaInput.setPreferredSize(new Dimension(30, 30));

        tecladoBtBox5.add(tecladoBtAutonomia);
        tecladoBtBox5.add(tecladoBtAutonomiaInput);

        menuAdicionarTecladoBT.add(tecladoBtBox5);

        //SEXTA LINHA
        JPanel tecladoBtBox6 = new JPanel();
        JLabel tecladoBtValorPreco = new JLabel("Preço:");
        JTextField tecladoBtPrecoInput = new JTextField();
        tecladoBtPrecoInput.setPreferredSize(new Dimension(180, 30));

        tecladoBtBox6.add(tecladoBtValorPreco);
        tecladoBtBox6.add(tecladoBtPrecoInput);

        menuAdicionarTecladoBT.add(tecladoBtBox6);

        //SETIMA LINHA
        JPanel tecladoBtBox7 = new JPanel();

        enviarTecladoBT.addActionListener(this);
        cancelarTecladoBT.addActionListener(this);
        tecladoBtBox7.add(enviarTecladoBT);
        tecladoBtBox7.add(cancelarTecladoBT);

        menuAdicionarTecladoBT.add(tecladoBtBox7);

        //FONE BLUETOOTH
        //TITULO
        JPanel foneBtBox0 = new JPanel();
        JLabel foneBtTitulo = new JLabel("Adicionar Fone Bluetooth");

        foneBtBox0.add(foneBtTitulo);
        menuAdicionarFoneBT.add(foneBtBox0);

        //PRIMEIRA LINHA
        JPanel foneBtBox1 = new JPanel();
        JLabel foneBtNomeMarca = new JLabel("Marca:");
        JTextField foneBtMarcaInput = new JTextField();
        foneBtMarcaInput.setPreferredSize(new Dimension(180, 30));

        foneBtBox1.add(foneBtNomeMarca);
        foneBtBox1.add(foneBtMarcaInput);

        menuAdicionarFoneBT.add(foneBtBox1);

        //SEGUNDA LINHA
        JPanel foneBtBox2 = new JPanel();
        JLabel foneBtNomeModelo = new JLabel("Modelo:");
        JTextField foneBtModeloInput = new JTextField();
        foneBtModeloInput.setPreferredSize(new Dimension(180, 30));

        foneBtBox2.add(foneBtNomeModelo);
        foneBtBox2.add(foneBtModeloInput);

        menuAdicionarFoneBT.add(foneBtBox2);

        //TERCEIRA LINHA
        JPanel foneBtBox3 = new JPanel();
        JLabel foneBtAutonomia = new JLabel("Autonomia da bateria (em horas):");
        JTextField foneBtAutonomiaInput = new JTextField();
        foneBtAutonomiaInput.setPreferredSize(new Dimension(30, 30));

        foneBtBox3.add(foneBtAutonomia);
        foneBtBox3.add(foneBtAutonomiaInput);

        menuAdicionarFoneBT.add(foneBtBox3);

        //QUARTA LINHA
        JPanel foneBtBox4 = new JPanel();
        JLabel foneBtValorPreco = new JLabel("Preço:");
        JTextField foneBtPrecoInput = new JTextField();
        foneBtPrecoInput.setPreferredSize(new Dimension(180, 30));

        foneBtBox4.add(foneBtValorPreco);
        foneBtBox4.add(foneBtPrecoInput);

        menuAdicionarFoneBT.add(foneBtBox4);

        //QUINTA LINHA
        JPanel foneBtBox5 = new JPanel();

        enviarFoneBT.addActionListener(this);
        cancelarFoneBT.addActionListener(this);
        foneBtBox5.add(enviarFoneBT);
        foneBtBox5.add(cancelarFoneBT);

        menuAdicionarFoneBT.add(foneBtBox5);

        //BOTÕES NO MENU LISTAR
        buttonMenu2.addActionListener(this);
        menuListar.add(buttonMenu2);

        //BOTÕES NO MENU REMOVER
        buttonMenu3.addActionListener(this);
        menuRemover.add(buttonMenu3);

        //BOTÕES NO MENU RESUMO
        buttonMenu4.addActionListener(this);
        menuResumo.add(buttonMenu4);

        //ADICIONANDO TODAS AS PÁGINAS AO CONTAINER

        //MENU PRINCIPAL
        panelContainer.add(menuPrincipal, "principal");
        panelContainer.add(menuAdicionar, "adicionar");
        panelContainer.add(menuListar, "listar");
        panelContainer.add(menuRemover, "remover");
        panelContainer.add(menuResumo, "resumo");

        //PÁGINAS DE PREENCHIMENTO DE INFORMAÇÃO DOS ITENS PARA ADIÇÃO AO ESTOQUE
        panelContainer.add(menuAdicionarSmartphone, "smartphone");
        panelContainer.add(menuAdicionarLaptop, "laptop");
        panelContainer.add(menuAdicionarMonitor, "monitor");
        panelContainer.add(menuAdicionarTecladoBT, "tecladobt");
        panelContainer.add(menuAdicionarFoneBT, "fonebt");

        //INICIANDO PROGRAMA NO MENU PRINCIPAL
        leiaute.show(panelContainer, "principal");

        //AÇÕES DOS BOTÕES
        buttonAdicionar.addActionListener(e -> leiaute.show(panelContainer, "adicionar"));
        buttonListar.addActionListener(e -> leiaute.show(panelContainer, "listar"));
        buttonRemover.addActionListener(e -> leiaute.show(panelContainer, "remover"));
        buttonResumo.addActionListener(e -> leiaute.show(panelContainer, "resumo"));

        //Configurações da Janela
        this.add(panelContainer);
        this.setTitle("gestEst");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        this.setSize(400, 500);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==buttonMenu1 || e.getSource()==buttonMenu2 || e.getSource()==buttonMenu3 || e.getSource()==buttonMenu4){
            leiaute.show(panelContainer, "principal");
        }else if(e.getSource()==adicionarSmartphone){
            leiaute.show(panelContainer, "smartphone");
        }else if(e.getSource()==enviarSmartphone){
            // TODO: 21/07/2023 ADICIONAR AQUI INSERÇÃO DO SMARTPHONE NO ESTOQUE
            System.out.println("smartphone adicionado");
            leiaute.show(panelContainer, "principal");
        }else if(e.getSource()==cancelarSmartphone){
            leiaute.show(panelContainer, "adicionar");
        }else if(e.getSource()==adicionarLaptop){
            leiaute.show(panelContainer, "laptop");
        }else if(e.getSource()==enviarLaptop){
            // TODO: 21/07/2023 ADICIONAR AQUI INSERÇÃO DO LAPTOP NO ESTOQUE
            System.out.println("laptop adicionado");
            leiaute.show(panelContainer, "principal");
        }else if(e.getSource()==cancelarLaptop){
            leiaute.show(panelContainer, "adicionar");
        }else if(e.getSource()==adicionarMonitor){
            leiaute.show(panelContainer, "monitor");
        }else if(e.getSource()==enviarMonitor){
            // TODO: 21/07/2023 ADICIONAR AQUI INSERÇÃO DO MONITOR NO ESTOQUE
            System.out.println("monitor adicionado");
            leiaute.show(panelContainer, "principal");
        }else if(e.getSource()==cancelarMonitor){
            leiaute.show(panelContainer, "adicionar");
        }else if(e.getSource()==adicionarTecladoBT){
            leiaute.show(panelContainer, "tecladobt");
        }else if(e.getSource()==enviarTecladoBT){
            // TODO: 21/07/2023 ADICIONAR AQUI INSERÇÃO DO TECLADO BLUETOOTH NO ESTOQUE
            System.out.println("teclado bluetooth adicionado");
            leiaute.show(panelContainer, "principal");
        }else if(e.getSource()==cancelarTecladoBT){
            leiaute.show(panelContainer, "adicionar");
        }else if(e.getSource()==adicionarFoneBT){
            leiaute.show(panelContainer, "fonebt");
        }else if(e.getSource()==enviarFoneBT){
            // TODO: 21/07/2023 ADICIONAR AQUI INSERÇÃO DO FONE BLUETOOTH NO ESTOQUE
            System.out.println("fone bluetooth adicionado");
            leiaute.show(panelContainer, "principal");
        }else if(e.getSource()==cancelarFoneBT){
            leiaute.show(panelContainer, "adicionar");
        }else if(e.getSource()==buttonFinalizar){
            this.dispose();
        }
    }
}