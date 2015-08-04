package main;


import paint.DrawItems;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by avisser on 30-7-2015.
 */
public class DemoHoofdstukV extends JFrame{
    public boolean isHead    = false;
    public boolean isBody    = false;
    public boolean isRightArm= false;
    public boolean isLeftArm = false;
    public boolean isRightLeg= false;
    public boolean isLeftLeg = false;

    java.util.List buttonList = new ArrayList();
    Iterator buttonIterator = null;

    int numberWrong = 0;
    int numberOfBodyParts = 6;

    String wordToGuess = "";
    String currentGuess = "";

    // Target words
    String[] wordsArray = {
            "native", "country", "color", "example", "helper",
            "favorite", "charcoal", "smoke", "interest", "video",
            "language", "drink", "homework","shell", "sympathy",
            "define", "specify", "drawing", "picture", "frame",
            "nutshell", "polygon", "circle", "rectangle", "sphere",
            "sherry", "lotion", "shoes", "trowsers", "belt",
            "blouse", "nightgown", "cowboy", "engineer", "waiter",
            "wheel", "engine", "pedal", "street", "navigate",
            "sailing", "skiing", "outboard", "runner", "dancer",
            "hero", "helpless", "pseudonym", "lioness", "integrity"
    };


    private JPanel drawPanel;
    private JPanel itemsPanel;
    private JLabel guessWord;
    private JLabel outcome;
    private JButton newGame = new JButton("New Game");


    /**
     * buttons
     */
    JButton aButt = new JButton("A");
    JButton bButt = new JButton("B");
    JButton cButt = new JButton("C");
    JButton dButt = new JButton("D");
    JButton eButt = new JButton("E");
    JButton fButt = new JButton("F");
    JButton gButt = new JButton("G");
    JButton hButt = new JButton("H");
    JButton iButt = new JButton("I");
    JButton jButt = new JButton("J");
    JButton kButt = new JButton("K");
    JButton lButt = new JButton("L");
    JButton mButt = new JButton("M");
    JButton nButt = new JButton("N");
    JButton oButt = new JButton("O");
    JButton pButt = new JButton("P");
    JButton qButt = new JButton("Q");
    JButton rButt = new JButton("R");
    JButton sButt = new JButton("S");
    JButton tButt = new JButton("T");
    JButton uButt = new JButton("U");
    JButton vButt = new JButton("V");
    JButton wButt = new JButton("W");
    JButton xButt = new JButton("X");
    JButton yButt = new JButton("Y");
    JButton zButt = new JButton("Z");

    /**
     * Create the application.
     */
    public DemoHoofdstukV() {
        initUI();
    }

    /**
     * set up a new game
     */


    public void setNewGame() {
        numberWrong = 0;

        //Enable alphabet buttons
        Iterator buttonIterator = buttonList.iterator();
        while( buttonIterator.hasNext() ) {
            ( (JButton)buttonIterator.next() ).setEnabled( true );
        }


        //get new word
        double wordNumber = Math.random();
        int next =  (int) (wordNumber * wordsArray.length);
        wordToGuess = wordsArray[next];

        //replace the letters of the word with ?
        currentGuess = "";
        for(int i=0; i<wordToGuess.length(); i++) {
            currentGuess = currentGuess.concat("?");
        }

        guessWord.setText(currentGuess);

        isHead = false;
        isBody = false;
        isLeftArm = false;
        isRightArm = false;
        isLeftLeg = false;
        isRightLeg = false;
        drawPanel.repaint();

        //temporary
        //outcome.setText(wordToGuess);
    }


    /**
     * initiates the UI
     */
    private void initUI() {

        this.setTitle("Demo Chapter 5");
        this.setSize(860, 360);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        ButtonListener listener = new ButtonListener();

        /**
         * building the drawing panell
         */
        drawPanel = new DrawItems(this);
        drawPanel.setBackground(new Color(255, 255, 255));
        drawPanel.setBounds(10, 10, 300, 300);
        drawPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.getContentPane().add(drawPanel);

        /**
         * building the items panell
         */
        itemsPanel = new JPanel();
        itemsPanel.setBounds(330, 10, 500, 300);
        itemsPanel.setLayout(null);
        itemsPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.getContentPane().add(itemsPanel);

        newGame.setBounds(390, 260, 100, 30);
        itemsPanel.add(newGame);
        newGame.addActionListener(listener);

        guessWord = new JLabel();
        guessWord.setBounds(10, 10, 400, 60);
        guessWord.setFont(new Font("Arial", Font.PLAIN, 60));
        itemsPanel.add(guessWord);

        outcome = new JLabel();
        outcome.setBounds(10, 270, 300, 20);
        itemsPanel.add(outcome);

        //buttons
        aButt.setBounds(10, 100, 50, 50);
        aButt.addActionListener(listener);
        buttonList.add(aButt);
        itemsPanel.add(aButt);
        bButt.setBounds(60, 100, 50, 50);
        bButt.addActionListener(listener);
        buttonList.add(bButt);
        itemsPanel.add(bButt);
        cButt.setBounds(110, 100, 50, 50);
        cButt.addActionListener(listener);
        buttonList.add(cButt);
        itemsPanel.add(cButt);
        dButt.setBounds(160, 100, 50, 50);
        dButt.addActionListener(listener);
        buttonList.add(dButt);
        itemsPanel.add(dButt);
        eButt.setBounds(210, 100, 50, 50);
        eButt.addActionListener(listener);
        buttonList.add(eButt);
        itemsPanel.add(eButt);
        fButt.setBounds(260, 100, 50, 50);
        fButt.addActionListener(listener);
        buttonList.add(fButt);
        itemsPanel.add(fButt);
        gButt.setBounds(310, 100, 50, 50);
        gButt.addActionListener(listener);
        buttonList.add(gButt);
        itemsPanel.add(gButt);
        hButt.setBounds(360, 100, 50, 50);
        hButt.addActionListener(listener);
        buttonList.add(hButt);
        itemsPanel.add(hButt);
        iButt.setBounds(410, 100, 50, 50);
        iButt.addActionListener(listener);
        buttonList.add(iButt);
        itemsPanel.add(iButt);
        jButt.setBounds(10, 150, 50, 50);
        jButt.addActionListener(listener);
        buttonList.add(jButt);
        itemsPanel.add(jButt);
        kButt.setBounds(60, 150, 50, 50);
        kButt.addActionListener(listener);
        buttonList.add(kButt);
        itemsPanel.add(kButt);
        lButt.setBounds(110, 150, 50, 50);
        lButt.addActionListener(listener);
        buttonList.add(lButt);
        itemsPanel.add(lButt);
        mButt.setBounds(160, 150, 50, 50);
        mButt.addActionListener(listener);
        buttonList.add(mButt);
        itemsPanel.add(mButt);
        nButt.setBounds(210, 150, 50, 50);
        nButt.addActionListener(listener);
        buttonList.add(nButt);
        itemsPanel.add(nButt);
        oButt.setBounds(260, 150, 50, 50);
        oButt.addActionListener(listener);
        buttonList.add(oButt);
        itemsPanel.add(oButt);
        pButt.setBounds(310, 150, 50, 50);
        pButt.addActionListener(listener);
        buttonList.add(pButt);
        itemsPanel.add(pButt);
        qButt.setBounds(360, 150, 50, 50);
        qButt.addActionListener(listener);
        buttonList.add(qButt);
        itemsPanel.add(qButt);
        rButt.setBounds(410, 150, 50, 50);
        rButt.addActionListener(listener);
        buttonList.add(rButt);
        itemsPanel.add(rButt);
        sButt.setBounds(10, 200, 50, 50);
        sButt.addActionListener(listener);
        buttonList.add(sButt);
        itemsPanel.add(sButt);
        tButt.setBounds(60, 200, 50, 50);
        tButt.addActionListener(listener);
        buttonList.add(tButt);
        itemsPanel.add(tButt);
        uButt.setBounds(110, 200, 50, 50);
        uButt.addActionListener(listener);
        buttonList.add(uButt);
        itemsPanel.add(uButt);
        vButt.setBounds(160, 200, 50, 50);
        vButt.addActionListener(listener);
        buttonList.add(vButt);
        itemsPanel.add(vButt);
        wButt.setBounds(210, 200, 50, 50);
        wButt.addActionListener(listener);
        buttonList.add(wButt);
        itemsPanel.add(wButt);
        xButt.setBounds(260, 200, 50, 50);
        xButt.addActionListener(listener);
        buttonList.add(xButt);
        itemsPanel.add(xButt);
        yButt.setBounds(310, 200, 50, 50);
        yButt.addActionListener(listener);
        buttonList.add(yButt);
        itemsPanel.add(yButt);
        zButt.setBounds(360, 200, 50, 50);
        zButt.addActionListener(listener);
        buttonList.add(zButt);
        itemsPanel.add(zButt);

        //Disable alphabet buttons
        Iterator buttonIterator = buttonList.iterator();
        while( buttonIterator.hasNext() ) {
            ( (JButton)buttonIterator.next() ).setEnabled( false );
        }
    }

    /**
     * Main method
     * @param args
     */
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new  DemoHoofdstukV().setVisible(true);
                } catch (final NullPointerException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Method that processes the answer given
     */
    public void processAnswer(String letter) {
        char newCharacter = letter.charAt(0);
        String nextGuess    = "";
        boolean foundAMatch = false;
        for( int i=0; i<wordToGuess.length(); i++ ) {
            char characterToMatch = wordToGuess.charAt(i);
            if( String.valueOf(characterToMatch).equalsIgnoreCase(String.valueOf(newCharacter)) ) {
                    nextGuess = nextGuess.concat( String.valueOf(newCharacter) );
                    foundAMatch = true;
                }
                else {
                    nextGuess = nextGuess.concat(String.valueOf
                            ( currentGuess.charAt(i) ));
                }
        }//for each character
        currentGuess = nextGuess;
        guessWord.setText( currentGuess );


        // We have a winner?
        if( currentGuess.equalsIgnoreCase( wordToGuess ) ) {

            //Disable alphabet buttons
            Iterator buttonIterator = buttonList.iterator();
            while( buttonIterator.hasNext() ) {
                ( (JButton)buttonIterator.next() ).setEnabled( false );
            }
            outcome.setText( "You Win!!!" );
        }
        // Wrong Answer
        //   Set out a new body part to be drawn by repaint()
        else {
            if( !foundAMatch ) {
                numberWrong++;
                switch (numberWrong){
                    case 1: { isHead     = true; break; }
                    case 2: { isBody     = true; break; }
                    case 3: { isLeftArm  = true; break; }
                    case 4: { isRightArm = true; break; }
                    case 5: { isLeftLeg  = true; break; }
                    case 6: { isRightLeg = true; break; }
                    default: System.out.println("You should be dead!");
                }
                // Repaint the gallows area JPanel
                drawPanel.repaint();
            }
            // Is the game over?
            if( numberWrong >= numberOfBodyParts ) {
                //Disable alphabet buttons
                Iterator buttonIterator = buttonList.iterator();
                while( buttonIterator.hasNext() ) {
                    ( (JButton)buttonIterator.next() ).setEnabled( false );
                }
                outcome.setText( "You lose!! the word was: " + wordToGuess);

            }
        }
    }


    /**
     * internal buttonlistener class to handle all the button actions
     */
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == newGame) {
                setNewGame();

            } else {
                JButton buttonPushed = (JButton) e.getSource();
                buttonPushed.setEnabled(false);
                processAnswer(buttonPushed.getText());
            }
        }
    }
}
