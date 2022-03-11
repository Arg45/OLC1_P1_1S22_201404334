package jtree;
 
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
 
public class TestMyJTree {
 
JFrame privado jframeMain = nuevo JFrame ("Mi árbol de Java");
private JPanel jpanelMain = new JPanel();
 
private JTree jtree;
 
 // Establecer este nodo como el nodo raíz
 Private DefaultMutableTreeNode dmtmRoot = new DefaultMutableTreeNode ("China");
 
private DefaultMutableTreeNode dmtmSichuan = new DefaultMutableTreeNode(
 "Sichuan");
 
private DefaultMutableTreeNode dmtmChengdu = new DefaultMutableTreeNode(
 "Chengdu");
 
private DefaultMutableTreeNode dmtmDujiangyan = new DefaultMutableTreeNode(
 "Dujiangyan");
 
private DefaultMutableTreeNode dmtmChongQing = new DefaultMutableTreeNode(
 "Chongqing");
 
 Private DefaultMutableTreeNode dmtmSPB = new DefaultMutableTreeNode ("Shapingba");
 
private DefaultMutableTreeNode dmtm;
 
private JScrollPane jspMain;
 
 // Definir un nodo que necesita ser arrastrado
private TreePath movePath;
 
public void init() {
jtree = new JTree(dmtmRoot);
 // Establece si el nodo raíz es visible, el valor predeterminado es visible
// jtree.setRootVisible(false);
jspMain = new JScrollPane(jtree);
dmtmRoot.add(dmtmSichuan);
dmtmRoot.add(dmtmSichuan);
dmtmChongQing.add(dmtmSPB);
dmtmSichuan.add(dmtmChengdu);
dmtmSichuan.add(dmtmDujiangyan);
dmtmRoot.add(dmtmChongQing);
 
for (int i = 0; i < 10; i++) {
dmtm = new DefaultMutableTreeNode(i);
dmtmRoot.add(dmtm);
}
 
 // Establecerlo sin conexión
jtree.putClientProperty("JTree.lineStyle", "None");
 // Establecer si se muestra el icono de su nodo raíz
jtree.setShowsRootHandles(true);
 
jpanelMain.setLayout(new BorderLayout());
jpanelMain.add(jspMain);
jframeMain.add(jpanelMain);
jframeMain.pack();
jframeMain.setLocationRelativeTo(null);
jframeMain.setSize(264, 400);
jframeMain.setDefaultCloseOperation(jframeMain.EXIT_ON_CLOSE);
jframeMain.setVisible(true);
 
 // La configuración se puede editar
jtree.setEditable(true);
 
 // Agregar evento de mouse
MouseListener ml = new MouseAdapter() {
 
 // Defina el TreePath que se arrastrará para obtener un nodo
TreePath tp;
 
 // cuando se presiona el mouse
@Override
public void mousePressed(MouseEvent e) {
// TODO Auto-generated method stub
// super.mousePressed(e);
 // Obtenga un nodo y // devuelva el nodo en la posición especificada
tp = jtree.getPathForLocation(e.getX(), e.getY());
if (tp != null) {
 movePath = tp; // Especifica el nodo a arrastrar
}
}
 
 // cuando se suelta el mouse
@Override
public void mouseReleased(MouseEvent e) {
// TODO Auto-generated method stub
// super.mouseReleased(e);
 // Obtener el nodo en la posición especificada cuando se suelta el mouse
tp = jtree.getPathForLocation(e.getX(), e.getY());
if (tp != null && movePath != null) {
 // Evita arrastrar a nodos secundarios y el arrastre no es en sí mismo
if (movePath.isDescendant(tp) && movePath != tp) {
 System.out.println ("operación ilegal");
return;
}
 // No arrastrar a nodos secundarios, ni al mismo nodo
else if (movePath != tp) {
 // imprime el último nodo arrastrado a
System.out.println(tp.getLastPathComponent());
 // El método add puede eliminar primero el nodo original del nodo padre original y luego agregarlo al nuevo nodo padre
 
 // obtener el último nodo
DefaultMutableTreeNode dmtnLastPath = (DefaultMutableTreeNode) tp
.getLastPathComponent();
 // obtener el nodo cuando el mouse hace clic
DefaultMutableTreeNode dmtnFirstPath = (DefaultMutableTreeNode) movePath
.getLastPathComponent();
 
 // Añadir nodo
dmtnLastPath.add(dmtnFirstPath);
 // actualización
jtree.updateUI();
}
}
 
}
};
 
jtree.addMouseListener(ml);
 
}
 
public static void main(String[] args) {
new TestMyJTree().init();
}
}
 
 
 
 