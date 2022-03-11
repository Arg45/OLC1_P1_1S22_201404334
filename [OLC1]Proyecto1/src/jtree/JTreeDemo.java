
package jtree;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTreeDemo
{
    public static void main(String[] agrs)
    {
        JFrame frame=new JFrame("Información sobre la formación del profesorado");
        frame.setSize(330,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JTreeDemo().createComponent());
        frame.pack();
        frame.setVisible(true);
    }
    private JPanel createComponent()
    {
        JPanel panel=new JPanel();
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Información sobre la formación del profesorado");
        String Teachers[][]=new String[3][];
        Teachers[0]=new String[]{"Wang Peng","Lee Man","Han Xiaoguo","Mu Bowling","Shang Lingyun","Fan Chaofeng"};
        Teachers[1]=new String[]{"Hu Huiqiang","Zhang Chunhui","Song Fang","Yangfang","Zhu Shangen","Zhang Qian","Canción Yuanyuan"};
        Teachers[2]=new String[]{"Liu Dan","Zhang Xiaofang","Liu Hualiang","Nie Lai","Wu Qiong"};
        String gradeNames[]={"maestría","Doctorado","Postdoctorado"};
        DefaultMutableTreeNode node=null;
        DefaultMutableTreeNode childNode=null;
        int length=0;
        for(int i=0;i<3;i++)
        {
            length=Teachers[i].length;
            node=new DefaultMutableTreeNode(gradeNames[i]);
            for (int j=0;j<length;j++)
            {
                childNode=new DefaultMutableTreeNode(Teachers[i][j]);
                node.add(childNode);
            }
            root.add(node);
        }
        JTree tree=new JTree(root);
        panel.add(tree);
        panel.setVisible(true);
        return panel;
    }
}