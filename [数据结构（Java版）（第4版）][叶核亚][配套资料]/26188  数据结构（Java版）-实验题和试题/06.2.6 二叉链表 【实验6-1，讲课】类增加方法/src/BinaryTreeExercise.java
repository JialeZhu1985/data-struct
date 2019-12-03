//�����ݽṹ��Java�棩����4�棩����⡷�����ߣ�Ҷ���ǣ�2015��2��10��
//6.2.6   �������Ķ�������ʵ��
//��ʵ����6-1��BinaryTree<T>�����������ӳ�Ա������

public class BinaryTreeExercise<T> extends BinaryTree<T> 
{
    public BinaryTreeExercise()                          //����ն�����
    {
        super();
    }

    //��1�� �ȸ����и����б�ʾ
    public BinaryTreeExercise(T[] prelist, T[] inlist)             //���ȸ����и�����������й��������
    {
        this.root = create(prelist, inlist, 0, 0, prelist.length);
    }
    //���ȸ����и����д���һ�����������������ֵ��prelist[preStart]��nָ�������г��ȣ�
    //���������������ĸ����
    private BinaryNode<T> create(T[] prelist, T[] inlist, int preStart, int inStart, int n)
    {
//        System.out.print("prelist:");
//        print(prelist, preStart, n);
//        System.out.print("��inlist:");
//        print(inlist, inStart, n);
//        System.out.println();
        
        if (n<=0)
            return null;
        T elem=prelist[preStart];                          //�����ֵ
        BinaryNode<T> p=new BinaryNode<T>(elem);           //����Ҷ�ӽ��
        int i=0;
        while (i<n && !elem.equals(inlist[inStart+i]))     //���и������в��Ҹ�ֵ����λ��
            i++;
        p.left = create(prelist, inlist, preStart+1, inStart, i);             //����������
        p.right = create(prelist, inlist, preStart+i+1, inStart+i+1, n-1-i);  //����������
        return p;
    }
    private void print(T[] table, int start, int n)
    {
        for (int i=0; i<n; i++)
    	    System.out.print(table[start+i]);
    }
       
    //��ʵ��6-1�� 
    public void leaf()                           //�������Ҷ�ӽ��
    {
        leaf(root);
    }
    //�����p���Ϊ��������������Ҷ�ӽ�㣬�ȸ���������㷨��3�ֱ���������һ��
    private void leaf(BinaryNode<T> p)
    {
        if(p!=null)
        {
            if (p.left==null && p.right==null)   //p.isLeaf()
                System.out.print(p.data.toString()+" ");
            leaf(p.left);
            leaf(p.right);
        }
    }
    
    public int leafCount()                       //���ض�������Ҷ�ӽ����
    {
        return leafCount(root);
    }
    private int leafCount(BinaryNode<T> p)       //������p���Ϊ����������Ҷ�ӽ�����
    {
        if (p==null)
            return 0;
        if (p.left==null && p.right==null) 
            return 1;
        return leafCount(p.left)+leafCount(p.right);
    }
    
    //���Ҳ������ȸ���������״γ��ֵĹؼ���Ϊkey���
    public BinaryNode<T> search(T key)
    {
        return search(root, key);
    }
    
    //����pΪ���������в��Ҳ������״γ��ֵĹؼ���ΪkeyԪ�ؽ�㣬��δ�ҵ�����null���ȸ��������
    private BinaryNode<T> search(BinaryNode<T> p, T key)
    {
        if (p==null || key==null)
            return null;
        if (p.data.equals(key)) 
            return p;                            //���ҳɹ��������ҵ����
        BinaryNode<T> find=search(p.left, key);  //���������в��ң��ݹ����
        if (find==null)                          //������������δ�ҵ�
            find=search(p.right, key);           //��������������в��ң��ݹ����
        return find;                             //���ز��ҽ��
    }
    public boolean contains(T key)               //�ж��Ƿ�����ؼ���ΪkeyԪ��
    {
        return this.search(key)!=null;
    }
    
    //����node���ĸ�ĸ��㣬��������δ�ҵ���nodeΪ�����򷵻�null
    public BinaryNode<T> getParent(BinaryNode<T> node)
    {
        if (root==null || node==null || node==root)
            return null; 
        return getParent(root, node);
    }
    //����pΪ���������в��Ҳ�����node���ĸ�ĸ���
    public BinaryNode<T> getParent(BinaryNode<T> p, BinaryNode<T> node)
    {
        if (p==null)
            return null;
        if (p.left==node || p.right==node) 
            return p;
        BinaryNode<T> find = getParent(p.left, node);
        if (find==null)
            find = getParent(p.right, node);
        return find;
    }

    public void replace(T x, T y)                //���״γ��ֵ�ֵΪx�Ľ��ֵ�滻Ϊy
    {
        BinaryNode<T> find = search(x);
        if (find!=null)
            find.data = y;
    }
    public void replaceAll(T x, T y)                       //��ֵΪx�Ľ��ֵȫ���滻Ϊy
    {
        if (x!=null && y!=null)
    	    replaceAll(root, x, y);
    }
    private void replaceAll(BinaryNode<T> p, T x, T y)     //����pΪ����������ʵ��ȫ���滻
    {
        if (p!=null)
        {
            if(p.data.equals(x)) 
                p.data = y;
            replaceAll(p.left, x, y);
            replaceAll(p.right, x, y);
        }
    }
    
    //����x������ڵĲ�Σ���������δ���ҵ�x����-1
    public int getLevel(T x)
    {
        return getLevel(root, 1, x);                //������Ĳ��Ϊ1
    }
    //����p��㣨���Ϊi��Ϊ���������У���x������ڵĲ��
    private int getLevel(BinaryNode<T> p, int i, T x)
    { 
        if (p==null)                             //��������Ҳ��ɹ�
            return -1;
        if (p.data.equals(x)) 
            return i;                            //���ҳɹ�
        int level = getLevel(p.left, i+1, x);       //������������
        if (level==-1)
            level = getLevel(p.right, i+1, x);      //�������������в���
        return level;
    }

    public boolean equals(Object obj)             //�Ƚ����ö������Ƿ���� ������Object���equals(obj)����
    {
        return obj==this || obj instanceof BinaryTree && equals(this.root, ((BinaryTree<T>)obj).root);
    }
    //�ж���p��q���Ϊ�������������Ƿ���ȣ��ݹ鷽��
    private boolean equals(BinaryNode<T> p, BinaryNode<T> q)
    {
        return p==null && q==null || p!=null && q!=null && p.data.equals(q.data) &&
               equals(p.left, q.left) && equals(p.right, q.right);
    } 
   
    //@author��Yeheya��2015-10-14
    //�������ۣ��и������ӿ������Ƿ��ܹ�ȷ��һ�ö�������
    
    //�Ա����������ĺ���������й����������
    //�㷨�����������ұ�Ԫ���Ǹ����ȴ������������ٴ���������
    private int i;
    public BinaryTreeExercise(T[] postlist)
    {
        i=postlist.length-1;
        this.root = create(postlist);
    }
    //�Դ�i��ʼ�ı����������ĺ�����У�����һ����postlist[i]Ϊ�������������ظ���㣬�ݹ鷽��
    private BinaryNode<T> create(T[] postlist)
    {
        BinaryNode<T> p = null;
        if (i>=0)
        {
            T elem=postlist[i];  i--;
            if (elem!=null)
            {
                p = new BinaryNode<T>(elem);     //����Ҷ�ӽ��
                p.right = create(postlist);      //����p�����������ݹ����
                p.left = create(postlist);       //����p�����������ݹ����
            }
        }
        return p;
    }
}
/* �����㷨����
    //�Ա������������и��������й����������
    //�㷨δ�ɹ����������ң����ұ�Ԫ���Ǹ����ȴ������������ٴ���������
    public void createBinaryTree(T[] inlist)
    {
        i=0;
        this.root = createInfix(inlist);
    }
    //�Դ�i��ʼ�ı������������и����У�����һ����inlist[i]Ϊ�������������ظ���㣬�ݹ鷽��
    private BinaryNode<T> createInfix(T[] inlist)
    {
        BinaryNode<T> p=null, left=null;
        if (i<inlist.length)
        {
            T elem=inlist[i];  i++;
            BinaryNode<T> left = createInfix(inlist);       //����p�����������ݹ���ã�ʵ�ʲ�������ʽ������ͬ
            if (elem!=null)
            {
                p = new BinaryNode<T>(elem);               //����Ҷ�ӽ��
                p.left = left;                  //����p�����������ݹ���ã�ʵ�ʲ�������ʽ������ͬ
                p.right = createInfix(inlist);                 //����p�����������ݹ���ã�ʵ�ʲ�������ʽ������ͬ
            }
        }
        return p;
    }
}*/
//@author��Yeheya��2015-10-14