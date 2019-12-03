//�����ݽṹ��Java�棩����4�棩�������ߣ�Ҷ���ǣ�2014��7��19�գ�JDK 8.05
//6.2.6   �������Ķ�������ʵ��
//9.  �������Ĳ�α����빹��
//��2�� �Բ�α������й�����ȫ������
 
//��ȫ�������࣬�̳ж������࣬��������洢�ṹ
public class CompleteBinaryTree<T> extends BinaryTree<T>
{
    int n;                                                 //������
    
    public CompleteBinaryTree()                            //����ն�����
    {
        super();
        this.n=0;
    }

    public CompleteBinaryTree(T[] levellist)               //�Բ�α�������levellist������ȫ������
    {
        this.root = create(levellist, 0);
        this.n = levellist.length;
    }

    private BinaryNode<T> create(T[] levellist, int i)     //������levellist[i]Ϊ�������������ظ����
    {
        BinaryNode<T> p = null;
        if (i<levellist.length)
        {
            p = new BinaryNode<T>(levellist[i]);           //����Ҷ�ӽ��
            p.left = create(levellist, 2*i+1);             //����p��������
            p.right = create(levellist, 2*i+2);            //����p��������
        }
        return p;
    }
    
    //ֻ֧�������ڲ�������������㡢ɾ��������������֧�ָ������������㡢ɾ���������������ǣ�ʡ��    
    public BinaryNode<T> insert(T x)   //�ڲ������������x��㣬���ز����㡣������ʡ��
    {
        return null;//����
    }
    public void removeLast()                 //ɾ��������е�����㡣������ʡ��
    {           }

    public static void main(String args[])
    {
        //ͼ6.20��ʾ��ȫ�������Ĳ�α�������
        String[] levellist = {"A","B","C","D","E","F","G","H"};
        CompleteBinaryTree<String> cbitree = new CompleteBinaryTree<String>(levellist);
        cbitree.preorder();
        cbitree.inorder();
        cbitree.postorder();
        cbitree.levelorder();
    }
}
/*
�������н�����£�
�ȸ����������������  A B D H �ġġ�E �ġ�C F �ġ�G �ġ�
�и����������������  H D B E A F C G 
������������������  H D E B F G C A 
��α�����������  A B C D E F G H 
�Ƿ���ȫ��������  true

*/

//author��Yeheya��2014-7-19