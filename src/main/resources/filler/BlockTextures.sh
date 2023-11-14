modid="justanotherchiselmod"
blockids=(lab_block lab_doted lab_tile lab_rounled lab_vent lab_l_tiles lab_m_tiles lab_dm_tiles lab_check_tiles lab_screen lab_f_screen lab_l_steel lab_m_steel lab_l_arrow lab_r_arrow lab_console)
subfolder="laboratory/"
textureids=(wallpanel dottedpanel largewall roundel wallvents-side largetile smalltile floortile checkertile wallpanel fuzzscreen largesteel-side sallsteel-side directionleft-side directionright-side infocon.side)

clear
cd ..
cd assets/$modid

echo "Auto-completador de .json para definir texturas de los bloques"

sleep .5

for ((i=0;i<${#blockids[@]};i++))
do
	cd blockstates
	touch ${blockids[i]}.json
	echo '{
	"variants": {
		"": {
			"model":  "'$modid':block/'${blockids[i]}'"
			}
		}
}' >> ${blockids[i]}.json

	echo "Creado blockstate de: ${blockids[i]}"
	sleep .5

	cd ..
	cd models/block

	touch ${blockids[i]}.json
	echo '{
	"parent": "block/cube_all",
	"textures": {
		"all": "'$modid':block/'$subfolder''${textureids[i]}'"
	}
}' >> ${blockids[i]}.json

	echo "Creado modelo de bloque de: ${blockids[i]}"
	sleep .5

	cd ..
	cd item

	touch ${blockids[i]}.json
	echo '{
	"parent": "'$modid':block/'${blockids[i]}'"
	}' >> ${blockids[i]}.json

	echo "Creado modelo de item de bloque de: ${blockids[i]}"
	sleep .5

	cd ..
	cd ..
done

echo "Todos los archivos creados"
