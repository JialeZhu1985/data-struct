//�����ݽṹ��Java�棩����4�棩����⡷�����ߣ�Ҷ���ǣ�2015��10��14��
//6.2.6   �������Ķ�������ʵ��
//��ʵ����6-1��BinaryTree<T>�����������ӳ�Ա������
    //�������ۣ��и������ӿ������Ƿ��ܹ�ȷ��һ�ö�������

public class BinaryTreeExercise_postlist 
{

    public static void main(String[] args) 
    {                                                           //ͼ6.15��ʾ�������������������ȸ���������
        String[] postlist={"G","D",null,"B",null,null,"E",null,null,"H",null,"F","C","A"};
        BinaryTreeExercise<String> bitree = new BinaryTreeExercise<String>(postlist);
        
        System.out.println("�ȸ����������������  "+bitree.toString());  //����������
        System.out.print("�и����������������  ");  bitree.inorder();
        System.out.print("������������������  ");  bitree.postorder();
    }

}
/*
 //
�ȸ����������������  A B D ��G �ġġ�C E �ġ�F H �ġġ�
�и����������������  D G B A E C H F 
������������������  G D B E H F C A 

�����㷨����
        String[] inlist={null,"B",null,"A",null,"C",null};
        BinaryTreeExercise<String> bitree = new BinaryTreeExercise<String>();
        bitree.createBinaryTree(inlist);
 *
 */
//@author��Yeheya��2015-10-14