//�����ݽṹ��Java�棩����4�棩����⡷�����ߣ�Ҷ���ǣ�2015��8��10��
//6.2.6   �������Ķ�������ʵ��
//��ʵ����6-2����BinaryTree<T>�������Ĳ�������̬������

public class BinaryTree_isComplete 
{
    public static <T> boolean isCompleteBinaryTree(BinaryTree<T> bitree)  //�ж��Ƿ���ȫ������
    {
       if (bitree.root==null)
           return true;
//          SeqQueue<BinaryNode<T>> que = new SeqQueue<BinaryNode<T>>(); //�����ն���
        LinkedQueue<BinaryNode<T>> que = new LinkedQueue<BinaryNode<T>>();
        que.add(bitree.root);                           //��������
        BinaryNode<T> p=null;
        while (!que.isEmpty())
        {
            p = que.poll();                      //pָ����ӽ��
            if (p.left!=null )                   //p�ķǿպ��ӽ�����
            {
                que.add(p.left);
                if (p.right!=null)
                    que.add(p.right);
                else break;                      //���ֿ�����������������Ƿ���Ҷ�ӽ��
            }
            else
                if (p.right!=null)
                    return false;                //p���������ն����������գ�ȷ������
                else break;                      //p��Ҷ�ӣ�����������Ƿ���Ҷ�ӽ��
        }
        while (!que.isEmpty())                   //���������Ƿ���Ҷ�ӽ��
        {
            p = que.poll();
            if (p.left!=null || p.right!=null)   //���ַ�Ҷ�ӣ�ȷ������
                return false;
        }
        return true;
    }

}
//@author��Yeheya��2015-8-10
