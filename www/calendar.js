v a r   c a l e n d a r   =   {  
 	 c r e a t e E v e n t :   f u n c t i o n ( t i t l e ,   l o c a t i o n ,   n o t e s ,   s t a r t D a t e ,   e n d D a t e ,   s u c c e s s C a l l b a c k ,   e r r o r C a l l b a c k )   	  
 	 {  
 	 	 c o r d o v a . e x e c (  
 	 	 	 s u c c e s s C a l l b a c k ,  
 	 	 	 e r r o r C a l l b a c k ,  
 	 	 	 ' C a l e n d a r ' ,  
 	 	 	 ' a d d C a l e n d e r E n t r y ' ,  
 	 	 	 [ {  
 	 	 	 	 " t i t l e " :   t i t l e ,  
 	 	 	 	 " d e s c r i p t i o n " :   n o t e s ,  
 	 	 	 	 " e v e n t L o c a t i o n " :   l o c a t i o n ,  
 	 	 	 	 " s t a r t T i m e M i l l i s " :   s t a r t D a t e . g e t T i m e ( ) ,  
 	 	 	 	 " e n d T i m e M i l l i s " :   e n d D a t e . g e t T i m e ( )  
 	 	 	 } ]  
 	 	 ) ;  
 	 }  
 }  
 m o d u l e . e x p o r t s   =   c a l e n d a r ; 