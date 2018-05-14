package PlusMoin;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;

 class JTextComponentOutputStream extends OutputStream {

    private final JTextComponent component;
    private final StringBuilder buffer;

    public JTextComponentOutputStream(JTextComponent component) {
        this.component = component;
        this.buffer = new StringBuilder();
    }

    @Override
    public void write(int b) throws IOException {
        buffer.append((char) b);
        component.setText(buffer.toString());
        component.setCaretPosition(buffer.length());
    }
}

 class InputStreamKeyListener extends PipedInputStream implements KeyListener {

    private final JTextComponent component;
    private final PipedOutputStream out;

    public InputStreamKeyListener(JTextComponent component) {
        super();
        try {
            this.component = component;
            this.out = new PipedOutputStream(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        component.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            try {
                String text = component.getText();
                out.write(text.getBytes());
                component.setText("");
                System.out.print(text);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

public class Test {
	private static final int Nombre = 0;
	static JFrame frame = new JFrame();
	static int essais=0;
    public static void initConsole() {
        
        JTextComponent outArea = new JTextArea();
        outArea.setEditable(false);
        OutputStream output = new JTextComponentOutputStream(outArea);
        PrintStream stream = new PrintStream(output);
        System.setOut(stream);
        System.setErr(stream);
        
        JTextPane inArea = new JTextPane();
        InputStream input = new InputStreamKeyListener(inArea);
        System.setIn(input);
        
        
        frame.add(new JScrollPane(outArea), BorderLayout.CENTER);
        frame.add(inArea, BorderLayout.SOUTH);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void PMafficher() {
        initConsole();
        Scanner scan = new Scanner(System.in);
        
        Random rand = new Random();
        int R1 = 0 ;
        int R2 = 0 ;
        int R3 = 0 ;
        int R4 = 0 ;
        int NM1 = rand.nextInt(9);
        int NM2 = rand.nextInt(9);
        int NM3 = rand.nextInt(9);
        int NM4 = rand.nextInt(9);
        int NombreMystere = (NM1 * 1000)+(NM2 * 100)+(NM3 * 10)+(NM4);
      JLabel label = new JLabel();
        label.setText("FJQifh");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        System.out.println("Jeu du Plus ou Moins..");
        System.out.println(NombreMystere);
        System.out.println("Trouvez le nombre mystere entre 0000 et 9999 !");
            do{
            System.out.println("Veuillez entrer un nombre...");
            int Nombre=scan.nextInt();   
            byte N1 =  (byte) (Nombre/1000) ;
            byte N2 = (byte) ((byte) (Nombre/100)-(N1*10));
            byte N3 = (byte) ((byte) (Nombre/10)-(N1*100)-(N2*10));
            byte N4 = (byte) ((byte) (Nombre)-(N1*1000)-(N2*100)-(N3*10));
            System.out.println(N1+" "+N2+" "+N3+" "+N4);
            
            
            if (N1<NM1)
                {
                System.out.print("+");
                
                
                Reload.essais++ ;
                }
            else if (N1>NM1)
                {
                System.out.print("-");
                
                Reload.essais++ ;
                }
            else
                {
                System.out.print("=");
                
                Reload.essais++ ;
                 R1 = 1 ;
                }
            
            
            
            if (N2<NM2) {
            	System.out.print("+");
            }
            else if (N2>NM2) {
            	System.out.print("-");
            }
            else {
            	System.out.print("=");
            	R2 = 1 ;
            }
            
            
            
            
            if (N3<NM3) {
            	System.out.print("+");
            }
            else if (N3>NM3) {
            	System.out.print("-");
            }
            else {
            	R3 = 1 ;
            	System.out.print("=");
            }
            
            
            
            if (N4<NM4) {
            	System.out.println("+");
            }
            else if (N4>NM4) {
            	System.out.println("-");
            }
            else {
            	System.out.println("=");
            	R4 = 1 ;
            }
            int R = R1+R2+R3+R4 ;
            Reload.R = R ;
            if(R==4) {
         	   Reload.reload();
            }
            }
            
            while(Nombre!=NombreMystere);
        throw new RuntimeException("Test");           
    }
}