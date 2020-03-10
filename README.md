# -home-user-GL-pglp_3_3
Illustration du principe de substitution de Liskov (LSP)

### Réponse 3.3.1 ###

 cette solution ne respecte pas le principe viole le pricipe LSP,    
 en effet , un RebotStatique est un sous type de Rebot, alors tout objet de type Rebot  
 peut être remplacé par un objet de type RebotStatique sans altérer les propriétés désirables du programme concerné.  
 or dans cette solution ce n'est pas le cas.  
 Un RebotStatique ayant par définition une Direction et une Position fixe,
 il convient de restreindre la modification de la Direction et de la Position pour qu'elles soient toujours fixes. 
 Néanmoins, si un RebotStatique est utilisé là où,comportementalement, on s'attend à interagir avec un Rebot, des comportements incohérents peuvent subvenir : 
 la position et la direction d'un RebotStatique ne peuvent être changés, contrairement à ceux d'un Rebot.
