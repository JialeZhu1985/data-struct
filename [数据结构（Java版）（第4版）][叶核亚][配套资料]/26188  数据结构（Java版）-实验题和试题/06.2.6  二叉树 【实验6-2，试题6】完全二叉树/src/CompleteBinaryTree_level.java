//�����ݽṹ��Java�棩����4�棩����⡷�����ߣ�Ҷ���ǣ�2015��8��6��
//6.2.6   �������Ķ�������ʵ��
//9.  �������Ĳ�α����빹��
//������6��  �Բ�α������й�����ȫ����������α���������ʹ��˳��ѭ�����еı仯ͼ��

public class CompleteBinaryTree_level 
{
    public static void main(String[] args) 
    {
//        String[] levellist = {"A","M","B","U","L","N","C","E"};              //ambulance�Ȼ���
        String[] levellist = {"H","E","L","I","C","O","P","T","R"};      //helicopterֱ���ɻ�
        System.out.print("�Բ�α������й�����ȫ��������  ");
        Array1.print(levellist);                         //����1.4
        
        CompleteBinaryTree<String> cbitree = new CompleteBinaryTree<String>(levellist);
                                      //�ɲ�α�������levellist������ȫ������
        cbitree.levelorder();      //���������cbitree�Ĳ�α�������
        
        //ϰ��6
//      System.out.println("�Ƿ���ȫ��������  "+cbitree.isCompleteBinaryTree());
    }
}
/*
�������н�����£�   
        //ambulance�Ȼ���
�Բ�α������й�����ȫ��������   A M B U L N C E
��α�����������  ����A��SeqQueue(M,B)
����M��SeqQueue(B,U,L)
����B��SeqQueue(U,L,N,C)
����U��SeqQueue(L,N,C,E)
����L��SeqQueue(N,C,E)
����N��SeqQueue(C,E)
����C��SeqQueue(E)
����E��SeqQueue()

                //helicopterֱ���ɻ�
�Բ�α������й�����ȫ��������   H E L I C O P T R
��α�����������  ����H��SeqQueue(E,L)
����E��SeqQueue(L,I,C)
����L��SeqQueue(I,C,O,P)
����I��SeqQueue(C,O,P,T,R)
����C��SeqQueue(O,P,T,R)
����O��SeqQueue(P,T,R)
����P��SeqQueue(T,R)
����T��SeqQueue(R)
����R��SeqQueue()



*/
//@author  Yeheya��2015-8-7
