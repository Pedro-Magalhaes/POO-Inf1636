package lista;

public class Lista 
{ 
	private int tam=0; 
	private No ini=null; 
	private No fim=null; 
	private No corr=null;          
	public boolean vazio() 
	{          
		return tam==0?true:false;
	}          
	public boolean insIni(Object x) 
	{          
		No novoNo = new No(x,ini);
		ini.setProx(novoNo);
		if(fim == null) {
			fim = novoNo;
		}
		tam++;
		ini = novoNo;
		return true;
	}          
	public boolean insFin(Object x) 
	{          
		No novoNo = new No(x,null);
		
		if(fim == null) {
			fim = novoNo;
			ini = novoNo;
		} else {
			fim.setProx(novoNo);
		}		
		tam++;
		return true;
	}  
	public Object retIni() 
	{          
		No aux = ini;
		ini = ini.getProx();
		tam--;
		return aux;
	}          
	public Object retFin() 
	{
		No i,aux;
		for(i = ini; i!=fim; i=i.getProx()) {
			
		}
		i.setProx(null);
		aux = fim;
		tam--;
		fim = i;
		return aux;
	}          
	public void posIni() 
	{          
		corr = ini;
	}          
	public Object prox() 
	{          
		if(corr == null) { 
			return corr;
		} else {
			No aux = corr;
			corr = corr.getProx();
			return aux;
		}
		
	}          
} 
