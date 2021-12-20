package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 * Primitivas1.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Gato implements GLEventListener {

    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Gato());
        frame.add(canvas);
        frame.setSize(1040, 680);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        gl.setSwapInterval(1);
        gl.glClearColor(0.5f, 1f, 0.5f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) {
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(160.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(0.0f, 0.0f, -6.0f);
        gl.glTranslatef(0.0f, 0.0f, 0.0f);
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(0,0);
        gl.glVertex2f(-3,5);
        gl.glVertex2f(2,5);
        gl.glEnd();

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-3,5);
        gl.glVertex2f(2,5);
        gl.glVertex2f(-1,10);
        gl.glEnd();

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-1,10);
        gl.glVertex2f(2,8);
        gl.glVertex2f(2,5);
        gl.glEnd();        

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-1,10);
        gl.glVertex2f(2,8);
        gl.glVertex2f(4,16);
        gl.glEnd();  

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-3,5);
        gl.glVertex2f(-9,4);
        gl.glVertex2f(-7,10);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-3,9);
        gl.glVertex2f(-7,10);
        gl.glVertex2f(-1,10);
        gl.glEnd();          
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-7,10);
        gl.glVertex2f(-3,5);
        gl.glVertex2f(-1,10);
        gl.glEnd();  

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-1,10);
        gl.glVertex2f(4,16);
        gl.glVertex2f(-3,13);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-5,10);
        gl.glVertex2f(-3,13);
        gl.glVertex2f(-1,10);
        gl.glEnd();
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-7,10);
        gl.glVertex2f(-5,10);
        gl.glVertex2f(-3,13);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-7,13);
        gl.glVertex2f(-7,10);
        gl.glVertex2f(-3,13);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-7,13);
        gl.glVertex2f(-9,11);
        gl.glVertex2f(-7,10);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-13,13);
        gl.glVertex2f(-9,11);
        gl.glVertex2f(-7,13);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-13,12);
        gl.glVertex2f(-13,13);
        gl.glVertex2f(-7,10);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(2,8);
        gl.glVertex2f(3,11);
        gl.glVertex2f(9,8);
        gl.glEnd();        

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(9,8);
        gl.glVertex2f(3,11);
        gl.glVertex2f(7,13);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(4,16);
        gl.glVertex2f(3,11);
        gl.glVertex2f(7,13);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(4,16);
        gl.glVertex2f(7,13);
        gl.glVertex2f(8,16);
        gl.glEnd();  

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(2,20);
        gl.glVertex2f(-3,17);
        gl.glVertex2f(8,16);
        gl.glEnd();    
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-3,17);
        gl.glVertex2f(-3,13);
        gl.glVertex2f(4,16);
        gl.glEnd();          
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-5,15);
        gl.glVertex2f(-3,17);
        gl.glVertex2f(-3,13);
        gl.glEnd();          
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-7,13);
        gl.glVertex2f(-3,13);
        gl.glVertex2f(-5,15);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-5,15);
        gl.glVertex2f(-3,17);
        gl.glVertex2f(-6,19);
        gl.glEnd();     
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-7,17);
        gl.glVertex2f(-7,13);
        gl.glVertex2f(-5,15);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-9,15);
        gl.glVertex2f(-7,13);
        gl.glVertex2f(-7,17);
        gl.glEnd();         
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-13,13);
        gl.glVertex2f(-7,13);
        gl.glVertex2f(-9,15);
        gl.glEnd();          
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-9,15);
        gl.glVertex2f(-13,13);
        gl.glVertex2f(-11,15);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-13,15);
        gl.glVertex2f(-11,15);
        gl.glVertex2f(-13,13);
        gl.glEnd();  

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-9,15);
        gl.glVertex2f(-11,17);
        gl.glVertex2f(-7,17);
        gl.glEnd();          
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-11,15);
        gl.glVertex2f(-11,17);
        gl.glVertex2f(-9,15);
        gl.glEnd();    
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-13,15);
        gl.glVertex2f(-11,15);
        gl.glVertex2f(-11,17);
        gl.glEnd();    
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-13,17);
        gl.glVertex2f(-13,15);
        gl.glVertex2f(-11,17);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-15,15);
        gl.glVertex2f(-13,14);
        gl.glVertex2f(-13,17);
        gl.glEnd();         
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-15,15);
        gl.glVertex2f(-13,14);
        gl.glVertex2f(-13,13);
        gl.glEnd();         
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(7,20);
        gl.glVertex2f(2,20);
        gl.glVertex2f(8,16);
        gl.glEnd();       
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-2,20);
        gl.glVertex2f(-3,17);
        gl.glVertex2f(2,20);
        gl.glEnd();     
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-6,19);
        gl.glVertex2f(-2,20);
        gl.glVertex2f(-3,17);
        gl.glEnd();          
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-11,17);
        gl.glVertex2f(-11,20);
        gl.glVertex2f(-7,17);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-11,20);
        gl.glVertex2f(-5,15);
        gl.glVertex2f(-6,19);
        gl.glEnd();    
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-12,20);
        gl.glVertex2f(-13,17);
        gl.glVertex2f(-11,17);
        gl.glEnd();     
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-12,20);
        gl.glVertex2f(-11,20);
        gl.glVertex2f(-11,17);
        gl.glEnd();          
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-11,22);
        gl.glVertex2f(-11,20);
        gl.glVertex2f(-12,20);
        gl.glEnd();         
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-11,20);
        gl.glVertex2f(-11,22);
        gl.glVertex2f(-7,21);
        gl.glEnd();      
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-11,20);
        gl.glVertex2f(-7,21);
        gl.glVertex2f(-6,19);
        gl.glEnd();          
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-11,22);
        gl.glVertex2f(-7,21);
        gl.glVertex2f(-7,23);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-6,19);
        gl.glVertex2f(-2,20);
        gl.glVertex2f(-7,22);
        gl.glEnd();        
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-6,19);
        gl.glVertex2f(-7,22);
        gl.glVertex2f(-7,21);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-2,20);
        gl.glVertex2f(7,20);
        gl.glVertex2f(1,24);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(6,24);
        gl.glVertex2f(7,20);
        gl.glVertex2f(1,24);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-2,20);
        gl.glVertex2f(-7,22);
        gl.glVertex2f(-7,27);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-7,27);
        gl.glVertex2f(1,24);
        gl.glVertex2f(-2,20);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-11,22);
        gl.glVertex2f(-7,23);
        gl.glVertex2f(-13,27);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(0,0);
        gl.glVertex2f(-3,5);
        gl.glVertex2f(-2,-5);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(0,0);
        gl.glVertex2f(2,5);
        gl.glVertex2f(2,-5);
        gl.glEnd();  
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-6,0);
        gl.glVertex2f(-2,-5);
        gl.glVertex2f(-3,5);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(2,8);
        gl.glVertex2f(7,-2);
        gl.glVertex2f(2,-5);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(2,8);
        gl.glVertex2f(7,-2);
        gl.glVertex2f(10,-4);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(9,8);
        gl.glVertex2f(2,8);
        gl.glVertex2f(10,-4);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-9,4);
        gl.glVertex2f(-3,5);
        gl.glVertex2f(-9,-5);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-7,-2);
        gl.glVertex2f(-6,0);
        gl.glVertex2f(-2,-5);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-2,-5);
        gl.glVertex2f(-7,-2);
        gl.glVertex2f(-9,-6);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-13,-2);
        gl.glVertex2f(-9,4);
        gl.glVertex2f(-9,-9);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-9,-6);
        gl.glVertex2f(-2,-5);
        gl.glVertex2f(-5,-13);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-2,-5);
        gl.glVertex2f(-5,-13);
        gl.glVertex2f(-2,-15);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-9,-6);
        gl.glVertex2f(-9,-12);
        gl.glVertex2f(-5,-13);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(2,-5);
        gl.glVertex2f(2,-11);
        gl.glVertex2f(7,-10);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(7,-2);
        gl.glVertex2f(2,-5);
        gl.glVertex2f(7,-10);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(7,-2);
        gl.glVertex2f(10,-7);
        gl.glVertex2f(7,-10);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(7,-10);
        gl.glVertex2f(10,-7);
        gl.glVertex2f(10,-10);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(7,-2);
        gl.glVertex2f(10,-4);
        gl.glVertex2f(10,-7);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(10,-4);
        gl.glVertex2f(10,-10);
        gl.glVertex2f(12,-9);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-13,-2);
        gl.glVertex2f(-9,-9);
        gl.glVertex2f(-14,-17);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-9,-9);
        gl.glVertex2f(-14,-17);
        gl.glVertex2f(-7,-24);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-9,-12);
        gl.glVertex2f(-5,-13);
        gl.glVertex2f(-7,-20);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-5,-13);
        gl.glVertex2f(-7,-20);
        gl.glVertex2f(-3,-23);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-5,-13);
        gl.glVertex2f(-2,-15);
        gl.glVertex2f(-3,-23);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-7,-20);
        gl.glVertex2f(-3,-23);
        gl.glVertex2f(-7,-24);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-14,-17);
        gl.glVertex2f(-12,-23);
        gl.glVertex2f(-7,-26);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-14,-17);
        gl.glVertex2f(-7,-24);
        gl.glVertex2f(-7,-26);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(2,-11);
        gl.glVertex2f(7,-10);
        gl.glVertex2f(3,-24);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(7,-10);
        gl.glVertex2f(10,-10);
        gl.glVertex2f(7,-21);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(10,-10);
        gl.glVertex2f(7,-21);
        gl.glVertex2f(14,-13);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(10,-10);
        gl.glVertex2f(12,-9);
        gl.glVertex2f(14,-13);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(14,-13);
        gl.glVertex2f(7,-21);
        gl.glVertex2f(14,-19);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(7,-21);
        gl.glVertex2f(8,-24);
        gl.glVertex2f(10,-23);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(7,-21);
        gl.glVertex2f(14,-19);
        gl.glVertex2f(10,-23);
        gl.glEnd();   
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(14,-19);
        gl.glVertex2f(10,-23);
        gl.glVertex2f(13,-23);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(7,-10);
        gl.glVertex2f(3,-24);
        gl.glVertex2f(7,-22);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-7,-24);
        gl.glVertex2f(-7,-28);
        gl.glVertex2f(-6,-28);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-7,-24);
        gl.glVertex2f(-6,-28);
        gl.glVertex2f(-5,-28);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-5,-28);
        gl.glVertex2f(-7,-24);
        gl.glVertex2f(-4,-25);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-3,-23);
        gl.glVertex2f(-4,-25);
        gl.glVertex2f(-7,-24);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-4,-25);
        gl.glVertex2f(-4,-28);
        gl.glVertex2f(-5,-28);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-3,-25);
        gl.glVertex2f(-3,-23);
        gl.glVertex2f(-4,-25);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-4,-28);
        gl.glVertex2f(-4,-25);
        gl.glVertex2f(-3,-25);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(3,-24);
        gl.glVertex2f(3,-28);
        gl.glVertex2f(5,-28);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(3,-24);
        gl.glVertex2f(8,-24);
        gl.glVertex2f(5,-28);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(7,-28);
        gl.glVertex2f(5,-28);
        gl.glVertex2f(8,-24);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(3,-24);
        gl.glVertex2f(8,-24);
        gl.glVertex2f(7,-22);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(8,-26);
        gl.glVertex2f(8,-24);
        gl.glVertex2f(10,-23);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-12,-23);
        gl.glVertex2f(-7,-27);
        gl.glVertex2f(-11,-27);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-7,-27);
        gl.glVertex2f(-7,-26);
        gl.glVertex2f(-12,-23);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-12,-23);
        gl.glVertex2f(-11,-27);
        gl.glVertex2f(-19,-23);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-11,-27);
        gl.glVertex2f(-19,-23);
        gl.glVertex2f(-16,-28);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-19,-23);
        gl.glVertex2f(-21,-27);
        gl.glVertex2f(-16,-28);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-19,-23);
        gl.glVertex2f(-21,-27);
        gl.glVertex2f(-25,-26);
        gl.glEnd();     
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-29,-25);
        gl.glVertex2f(-25,-26);
        gl.glVertex2f(-19,-23);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-29,-25);
        gl.glVertex2f(-28,-26);
        gl.glVertex2f(-25,-26);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-28,-26);
        gl.glVertex2f(-25,-26);
        gl.glVertex2f(-25,-30);
        gl.glEnd(); 
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-21,-27);
        gl.glVertex2f(-25,-26);
        gl.glVertex2f(-25,-30);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-28,-26);
        gl.glVertex2f(-25,-30);
        gl.glVertex2f(-31,-30);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-29,-25);
        gl.glVertex2f(-28,-26);
        gl.glVertex2f(-31,-30);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-31,-30);
        gl.glVertex2f(-25,-30);
        gl.glVertex2f(-26,-33);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.4f, 0.4f, 0.4f);
        gl.glVertex2f(-26,-33);
        gl.glVertex2f(-25,-30);
        gl.glVertex2f(-20,-32);
        gl.glEnd();       
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-20,-30);
        gl.glVertex2f(-20,-32);
        gl.glVertex2f(-23,-31);
        gl.glEnd();    
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(-3,-25);
        gl.glVertex2f(-4,-28);
        gl.glVertex2f(-1,-28);
        gl.glEnd();      
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glVertex2f(3,-28);
        gl.glVertex2f(3,-24);
        gl.glVertex2f(1,-28);
        gl.glEnd();     
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(0,0);
        gl.glVertex2f(2,-5);
        gl.glVertex2f(-2,-5);
        gl.glEnd();    
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(-2,-5);
        gl.glVertex2f(2,-11);
        gl.glVertex2f(2,-5);
        gl.glEnd(); 

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(-2,-11);
        gl.glVertex2f(2,-11);
        gl.glVertex2f(-2,-5);
        gl.glEnd();    
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(-2,-15);
        gl.glVertex2f(-2,-11);
        gl.glVertex2f(2,-11);
        gl.glEnd();     
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(-2,-15);
        gl.glVertex2f(3,-24);
        gl.glVertex2f(2,-11);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(3,-24);
        gl.glVertex2f(-2,-15);
        gl.glVertex2f(-3,-23);
        gl.glEnd();
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(-3,-23);
        gl.glVertex2f(-3,-25);
        gl.glVertex2f(3,-24);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(3,-24);
        gl.glVertex2f(1,-28);
        gl.glVertex2f(-3,-25);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(2f, 2f, 2f);
        gl.glVertex2f(1,-28);
        gl.glVertex2f(-3,-25);
        gl.glVertex2f(-1,-28);
        gl.glEnd();    
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(-35,30);
        gl.glVertex2f(-40,28);
        gl.glVertex2f(-34,24);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(-35,30);
        gl.glVertex2f(-32,28);
        gl.glVertex2f(-34,24);
        gl.glEnd();      
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(-32,28);
        gl.glVertex2f(-27,25);
        gl.glVertex2f(-34,24);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(-28,28);
        gl.glVertex2f(-32,28);
        gl.glVertex2f(-27,25);
        gl.glEnd(); 
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(-32,28);
        gl.glVertex2f(-28,28);
        gl.glVertex2f(-35,30);
        gl.glEnd();      
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(-28,28);
        gl.glVertex2f(-35,30);
        gl.glVertex2f(-29,31);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(-29,31);
        gl.glVertex2f(-28,28);
        gl.glVertex2f(-24,30);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(-28,28);
        gl.glVertex2f(-27,25);
        gl.glVertex2f(-24,30);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(-27,25);
        gl.glVertex2f(-22,27);
        gl.glVertex2f(-24,30);
        gl.glEnd();  
        
        //Nube derecha
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(35,20);
        gl.glVertex2f(40,18);
        gl.glVertex2f(34,14);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(35,20);
        gl.glVertex2f(32,18);
        gl.glVertex2f(34,14);
        gl.glEnd();      
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(32,18);
        gl.glVertex2f(27,15);
        gl.glVertex2f(34,14);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(28,18);
        gl.glVertex2f(32,18);
        gl.glVertex2f(27,15);
        gl.glEnd(); 
                
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(32,18);
        gl.glVertex2f(28,18);
        gl.glVertex2f(35,20);
        gl.glEnd();      
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(28,18);
        gl.glVertex2f(35,20);
        gl.glVertex2f(29,21);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(29,21);
        gl.glVertex2f(28,18);
        gl.glVertex2f(24,20);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glVertex2f(28,18);
        gl.glVertex2f(27,15);
        gl.glVertex2f(24,20);
        gl.glEnd();   
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex2f(27,15);
        gl.glVertex2f(22,17);
        gl.glVertex2f(24,20);
        gl.glEnd();    
        
        //Mariposa
        gl.glRotatef(3, 80, 80, 80);        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.5f, 0.0f, 0.0f);
        gl.glVertex2f(-35,0);
        gl.glColor3f(1.0f, 1.0f, 0.0f);        
        gl.glVertex2f(-36,1);
        gl.glColor3f(0.5f, 0.0f, 0.0f);        
        gl.glVertex2f(-35,2);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.5f, 0.0f, 0.0f);
        gl.glVertex2f(-35,0);
        gl.glColor3f(0.5f, 0.0f, 0.0f);          
        gl.glVertex2f(-36,-1);
        gl.glColor3f(1.0f, 1.0f, 0.0f);          
        gl.glVertex2f(-35,-2);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1.0f, 1.0f, 0.0f);  
        gl.glVertex2f(-35,2);
        gl.glColor3f(0.5f, 0.0f, 0.0f);         
        gl.glVertex2f(-36,3);
        gl.glColor3f(0.5f, 0.0f, 0.0f);         
        gl.glVertex2f(-35,3);
        gl.glEnd();         
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.5f, 0.0f, 0.0f); 
        gl.glVertex2f(-36,3);
        gl.glColor3f(1.0f, 1.0f, 0.0f);          
        gl.glVertex2f(-36,5);
        gl.glColor3f(0.5f, 0.0f, 0.0f);        
        gl.glVertex2f(-37,4);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.5f, 0.0f, 0.0f);
        gl.glVertex2f(-36,1);
        gl.glColor3f(1.0f, 1.0f, 0.0f);
        gl.glVertex2f(-40,1);
        gl.glColor3f(0.5f, 0.0f, 0.0f);        
        gl.glVertex2f(-39,4);
        gl.glEnd();          
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1.0f, 1.0f, 0.0f);
        gl.glVertex2f(-36,-1);
        gl.glColor3f(0.5f, 0.0f, 0.0f);         
        gl.glVertex2f(-37,-4);
        gl.glColor3f(0.5f, 0.0f, 0.0f);         
        gl.glVertex2f(-39,-2);
        gl.glEnd();     
        
        
        //Mariposa Derecho
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.5f, 0.0f, 0.0f); 
        gl.glVertex2f(-35,0);
        gl.glColor3f(1.0f, 1.0f, 0.0f);        
        gl.glVertex2f(-34,1);
        gl.glColor3f(0.5f, 0.0f, 0.0f);         
        gl.glVertex2f(-35,2);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1.0f, 1.0f, 0.0f);
        gl.glVertex2f(-35,0);
        gl.glColor3f(0.5f, 0.0f, 0.0f);          
        gl.glVertex2f(-34,-1);
        gl.glColor3f(0.5f, 0.0f, 0.0f);          
        gl.glVertex2f(-35,-2);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.5f, 0.0f, 0.0f);  
        gl.glVertex2f(-35,2);
        gl.glColor3f(1.0f, 1.0f, 0.0f);        
        gl.glVertex2f(-34,3);
        gl.glColor3f(0.5f, 0.0f, 0.0f);          
        gl.glVertex2f(-35,3);
        gl.glEnd();         
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1.0f, 1.0f, 0.0f);
        gl.glVertex2f(-34,3);
        gl.glColor3f(0.5f, 0.0f, 0.0f);         
        gl.glVertex2f(-34,5);
        gl.glColor3f(0.5f, 0.0f, 0.0f);         
        gl.glVertex2f(-33,4);
        gl.glEnd();        
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.5f, 0.0f, 0.0f); 
        gl.glVertex2f(-34,1);
        gl.glColor3f(1.0f, 1.0f, 0.0f);        
        gl.glVertex2f(-30,1);
        gl.glColor3f(0.5f, 0.0f, 0.0f);         
        gl.glVertex2f(-31,4);
        gl.glEnd();          
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1.0f, 1.0f, 0.0f);
        gl.glVertex2f(-34,-1);
        gl.glColor3f(0.5f, 0.0f, 0.0f);          
        gl.glVertex2f(-33,-4);
        gl.glColor3f(0.5f, 0.0f, 0.0f);          
        gl.glVertex2f(-31,-2);
        gl.glEnd();          
        
        //Gl rotatef
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 0f);
        gl.glVertex2f(24,-18);
        gl.glVertex2f(28,-18);        
        gl.glVertex2f(26,-25);
        gl.glEnd();  
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0f, 1f, 0f);
        gl.glVertex2f(24,-32);
        gl.glVertex2f(28,-32);        
        gl.glVertex2f(26,-25);
        gl.glEnd();      
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0f, 0f, 0.5f);
        gl.glVertex2f(19,-21);
        gl.glVertex2f(24,-18);
        gl.glVertex2f(26,-25);
        gl.glEnd(); 
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 0f, 0f);
        gl.glVertex2f(26,-25);
        gl.glVertex2f(17,-25);        
        gl.glVertex2f(19,-21);
        gl.glEnd();      
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0.5f, 0f, 0.5f);
        gl.glVertex2f(19,-29);
        gl.glVertex2f(17,-25);
        gl.glVertex2f(26,-25);
        gl.glEnd();       
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 0f, 0.5f);
        gl.glVertex2f(24,-32);
        gl.glVertex2f(26,-25);        
        gl.glVertex2f(19,-29);
        gl.glEnd(); 
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 0f, 0f);
        gl.glVertex2f(35,-25);
        gl.glVertex2f(26,-25);        
        gl.glVertex2f(33,-21);
        gl.glEnd(); 

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 0f, 0.5f);
        gl.glVertex2f(33,-21);
        gl.glVertex2f(28,-18);
        gl.glVertex2f(26,-25);
        gl.glEnd();   

        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(0f, 0f, 0.5f);
        gl.glVertex2f(35,-25);
        gl.glVertex2f(33,-29);
        gl.glVertex2f(26,-25);
        gl.glEnd();     
        
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glColor3f(1f, 1f, 0f);
        gl.glVertex2f(33,-29);
        gl.glVertex2f(26,-25);        
        gl.glVertex2f(28,-32);
        gl.glEnd();         
        
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}