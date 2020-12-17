;rule9
(defrule rule9
	(phone_selected (price ?price))
	
=> 
	(if (< ?price ?*better*) then
		(bind ?*better* ?price)
	)
)