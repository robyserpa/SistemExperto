(defclass specs
	(is-a USER)
	(role concrete)
	(pattern-match reactive)
	(slot brand
	 (type STRING)
	)
	(multislot name_device
	 (type STRING)
	 (cardinality 1 3)
	)
	(slot type_device
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Gama_Alta_Premium Gama_Alta Gama_Media Gama_Baja)
	)
	(slot screen
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd OLED IPS)
	)
	(slot resolution
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd 4_2K FULLHD HD)
	)
	(slot fps
	 (type INTEGER)
	 (range 60 144)
	)
	(multislot processor
	 (type STRING)
	 (cardinality 1 3)
	)
	(slot ram
	 (type INTEGER)
	)
	(slot rom
	 (type INTEGER)
	)
	(slot microsd
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot battery
	 (type INTEGER)
	 (range 1000 7000)
	)
	(slot charge_lvl
	 (type INTEGER)
	 (range 10 70)
	)
	(slot wireless_charge
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot nfc
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot fingerprint
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot facial_recognition
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot camera_quality
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Excelente Normal Baja)
	)
	(slot video_quality
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Excelente Normal Baja)
	)
	(slot video_camera
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd 8K 4K FULLHD HD)
	)
	(slot waterproof_specs
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd AguaPolvo Salpicaduras Ninguna)
	)
	(slot waterproof
	 (type SYMBOL)
	 (default Ninguna)
	)
	(slot sound
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Excelente Normal Baja)
	)
	(slot connective
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd 5G 4G)
	)
	(slot size
	 (type FLOAT)
	 (range 10.0 20.0)
	)
	(slot weight
	 (type FLOAT)
	 (range 100.0 300.0)
	)
	(slot price
	 (type FLOAT)
	 (range 100.0 2000.0)
	)
)

(deftemplate phone
	(slot type_device
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Gama_Alta_Premium Gama_Alta Gama_Media Gama_Baja)
	)
	(slot screen
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd OLED IPS)
	)
	(slot resolution
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd 4_2K FULLHD HD)
	)
	(slot fps
	 (type INTEGER)
	 (range 60 144)
	)
	(slot ram
	 (type INTEGER)
	)
	(slot rom
	 (type INTEGER)
	)
	(slot microsd
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si)
	)
	(slot battery
	 (type INTEGER)
	 (range 1000 7000)
	)
	(slot charge_lvl
	 (type INTEGER)
	 (range 10 70)
	)
	(slot wireless_charge
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot nfc
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot fingerprint
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot facial_recognition
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot camera_quality
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Excelente Normal Baja)
	)
	(slot video_camera
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Excelente Normal Baja)
	)
	(slot waterproof
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd AguaPolvo Salpicaduras Ninguna)
	)
	(slot sound
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Excelente Normal Baja)
	)
	(slot connective
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd 5G 4G)
	)
	(slot size
	 (type FLOAT)
	 (range 10.0 20.0)
	)
	(slot weight
	 (type FLOAT)
	 (range 100.0 300.0)
	)
)

(deftemplate phone_selected
	(slot brand
	 (type STRING)
	)
	(multislot name_device
	 (type STRING)
	 (cardinality 1 3)
	)
	(slot type_device
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Gama_Alta_Premium Gama_Alta Gama_Media Gama_Baja)
	)
	(slot screen
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd OLED IPS)
	)
	(slot resolution
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd 4_2K FULLHD HD)
	)
	(slot fps
	 (type INTEGER)
	 (range 60 144)
	)
	(multislot processor
	 (type STRING)
	 (cardinality 1 3)
	)
	(slot ram
	 (type INTEGER)
	)
	(slot rom
	 (type INTEGER)
	)
	(slot microsd
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot battery
	 (type INTEGER)
	 (range 1000 7000)
	)
	(slot charge_lvl
	 (type INTEGER)
	 (range 10 70)
	)
	(slot wireless_charge
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot nfc
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot fingerprint
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot facial_recognition
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Si No)
	)
	(slot camera_quality
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Excelente Normal Baja)
	)
	(slot video_quality
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Excelente Normal Baja)
	)
	(slot video_camera
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd 8K 4K FULLHD HD)
	)
	(slot waterproof_specs
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd AguaPolvo Salpicaduras Ninguna)
	)
	(slot waterproof
	 (type SYMBOL)
	 (default Ninguna)
	)
	(slot sound
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd Excelente Normal Baja)
	)
	(slot connective
	 (type SYMBOL)
	 (default sd)
	 (allowed-symbols sd 5G 4G)
	)
	(slot size
	 (type FLOAT)
	 (range 10.0 20.0)
	)
	(slot weight
	 (type FLOAT)
	 (range 100.0 300.0)
	)
	(slot price
	 (type FLOAT)
	 (range 100.0 2000.0)
	)
)

(defglobal ?*better* = 10000)