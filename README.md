# Poison-plugin
Plugin using NBT tags for giving poison and wither effects to enemy.
Plugin is for Minecraft 1.18.1.
You can give NBT tag to any item or weapon, and ever hit by that item/weapon will apply Wither or Poison effect.

A value of NBT tag is time of the effect duration in seconds.
To get an item with the desired effect of the potion and the desired duration of the effect, you need the command:
```/give <Nickname> <minecraft:item> {<NBTtag: "<Time in seconds>">}```

The example below creates a diamond sword with a poison effect for 5 seconds:
```/give AlwaysProg minecraft:diamond_sword{EffectPoison:"5"}```
  
  
Exists BNT tags:<br/>
<code>Wither</code> - EffectWither<br/>
<code>Wither LvL2</code> - EffectWither2<br/>
<code>Poison</code> - EffectPoison<br/>
<code>Poison LvL2</code> - EffectPoison2<br/>


Code is here: <code>https://github.com/Always-prog/Poison-plugin/tree/main/src/main</code><br/>
Plugin in .jar is here: <code>https://github.com/Always-prog/Poison-plugin/tree/main/out/</code>
