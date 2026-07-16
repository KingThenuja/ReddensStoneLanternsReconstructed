- ## When reporting issues, please include your<br>
### Minecraft version,<br>
### your mod loader (Fabric/Forge/NeoForge),<br>
### and any relevant crash logs or screenshots which includes stacktraces.<hr>

- ## Here is an example issue template most developers love:
> Minecraft Version:<br>
> Ex.: 1.21.11
>
> ReddensStoneLanternsReconstructedVersion:<br>
> Ex.: ReddensStoneLanternsReconstructed 1.0
>
> Fabric API Version:<br>
> Ex.: FabricAPI 0.141.4+1.21.11
>
> Operating System:<br>
> Windows 11
> 
> What is your GPU?<br>
> Ex.: RTX 4060
> 
> What is your CPU?<br>
> Ex.: Intel i7 13700k
>
> Java Version:<br>
> Ex.: Java 21
>
>Ex.: Reproduction Steps:<br>
>>I simply attempted to load my world with the latest versions of all mods in my custom modpack, but the game crashed when attempting to load the world. At first I removed C2ME, Scalable Lux and Async Particles, but this didn't fix it.
>>I then downgraded my Iris and Sodium versions to 1.10.9 and 1.8.12, after which the world loaded. I then replaced them with the new versions again (after exiting the game) and attempted to reload the world, but it crashed again for the same reason.
>
>Ex.: Crash Report file and latest.log:
>```shell
>---- Minecraft Crash Report ----
>// Who set us up the TNT?
>
>Time: 2026-07-10 16:39:08
>Description: Unexpected error
>
>java.lang.NullPointerException: Cannot invoke "net.minecraft.client.player.LocalPlayer.isSpectator()" because "this.minecraft.player" is null
>	at knot//net.minecraft.client.renderer.LevelRenderer.update(LevelRenderer.java:477)
>	at knot//net.minecraft.client.renderer.GameRenderer.update(GameRenderer.java:394)
>	at knot//net.minecraft.client.Minecraft.renderFrame$mixinextras$wrapped$426(Minecraft.java:1418)
>	at knot//net.minecraft.client.Minecraft.mixinextras$bridge$renderFrame$mixinextras$wrapped$426$427(Minecraft.java)
>	at knot//net.minecraft.client.Minecraft.wrapMethod$bkn000$dynamic_fps_common$renderFrame(Minecraft.java:12187)
>	at knot//net.minecraft.client.Minecraft.renderFrame(Minecraft.java)
>	at knot//net.minecraft.client.Minecraft.runTick(Minecraft.java:1378)
>	at knot//net.minecraft.client.Minecraft.run(Minecraft.java:991)
>	at java.base/java.lang.Thread.run(Thread.java:1474)
>
>
>A detailed walkthrough of the error, its code path and all known details is as follows:
>---------------------------------------------------------------------------------------
>
>-- Head --
>Thread: Render thread
>Stacktrace:
>	at knot//net.minecraft.client.renderer.LevelRenderer.update(LevelRenderer.java:477)
>	at knot//net.minecraft.client.renderer.GameRenderer.update(GameRenderer.java:394)
>	at knot//net.minecraft.client.Minecraft.renderFrame$mixinextras$wrapped$426(Minecraft.java:1418)
>	at knot//net.minecraft.client.Minecraft.mixinextras$bridge$renderFrame$mixinextras$wrapped$426$427(Minecraft.java)
>	at knot//net.minecraft.client.Minecraft.wrapMethod$bkn000$dynamic_fps_common$renderFrame(Minecraft.java:12187)
>
>-- Uptime --
>Details:
>	JVM uptime: 55.011s
>	Wall uptime: 43.907s
>	High-res time: 30.044s
>	Client ticks: 231 ticks / 11.550s
>Stacktrace:
>	at knot//net.minecraft.client.Minecraft.fillReport(Minecraft.java:2529)
>	at knot//net.minecraft.client.Minecraft.emergencySaveAndCrash(Minecraft.java:1047)
>	at knot//net.minecraft.client.Minecraft.run(Minecraft.java:1015)
>	at java.base/java.lang.Thread.run(Thread.java:1474)
>
>-- Affected level --
>Details:
>	All players: 0 total; 
>	Chunk stats: 729, 0
>	Level dimension: minecraft:overworld
>	Level time: 0 game time, 0 day time
>	Level spawn location: World: (8,64,8), Section: (at 8,0,8 in 0,4,0; chunk contains blocks 0,-64,0 to 15,2031,15), Region: (0,0; contains chunks 0,0 to 31,31, blocks 0,-64,0 to 511,2031,511)
>	Server brand: ~~ERROR~~ NullPointerException: Cannot read field "connection" because "this.minecraft.player" is null
>	Server type: Integrated singleplayer server
>	Tracked entity count: 0
>	Client weather: Raining: false, thundering: false
>
>-- Last reload --
>Details:
>	Reload number: 1
>	Reload reason: initial
>	Finished: Yes
>	Packs: vanilla, ali, almanac, ambientsounds, animalgarden_alligatorgar, animalgarden_bullshark, animalgarden_commonraven, animalgarden_crocodile, animalgarden_fennecfox, animalgarden_harpseal, animalgarden_hippopotamus, animalgarden_lion, animalgarden_manatee, animalgarden_meerkat, animalgarden_mouse, animalgarden_narwhal, animalgarden_owl, animalgarden_porcupine, animalgarden_prairiedog, animalgarden_redpanda, animalgarden_redriverhog, animalgarden_seaotter, animalgarden_snowleopard, animalgarden_spottedhyena, animalgarden_springhare, animalgarden_sugarglider, animalgarden_vicuna, animalgarden_westerngorilla, animalgarden_whiterhinoceros, animalgarden_yellowmongoose, aquarius_libs, asyncparticles, audioplayer, beautify, bettercapes, betterrenderdistance, birds-boids, boids, c2me, camerautils, chatanimation, cicada, cloth-config, collective, conditional-mixin, configurable, connectedglass, continuity, controlify, creativecore, cristellib, crittersandcompanions, cullleaves, dark-loading-screen, deermod, delightlib, displaydelight, do_a_barrel_roll, dynamic_fps, dynamic_fps_common, ecologics, electronic_device_mod, entity_model_features, entity_texture_features, entityculling, evs, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-getter-api-v2, fabric-command-api-v2, fabric-content-registries-v0, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-creative-tab-api-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-debug-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-item-api-v1, fabric-key-mapping-api-v1, fabric-language-kotlin, fabric-lifecycle-events-v1, fabric-loot-api-v3, fabric-menu-api-v1, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-permission-api-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-resource-loader-v1, fabric-screen-api-v1, fabric-serialization-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, fallingleavesplus, fancy-door-anim, farmersdelight, forgeconfigapiport, framework, fusion, fzmm, fzzy_config, gnetum, immediatelyfast, immersivethunder, iris, jei, kirin, krypton, letmedespawn, lithium, mcwbridges, mcwdoors, mcwfences, mcwfurnitures, mcwholidays, mcwlights, mcwroofs, mcwstairs, mcwtrpdoors, mcwwindows, mdm, midnightlib, mindfuldarkness, modernfix, modmenu, moreculling, moredelight, naturalwaters, neruina, org_apache_commons_commons-math3, owo, particlerain, picturemode, pingview, pixelshot, placeable_food, placeholder-api, plushables, pneumonocore, polymer-blocks, polymer-core, polymer-qol, polymer-resource-pack, presencefootsteps, ptsdeco, realisticbees, refurbished_furniture, resourcify, rusticdelight, scalablelux, sealife, shouldercats, simplycozyenchantmentlib, simplycozymod, simplyweapons, skinlayers3d, skinrestorer, skniro_furniture, sodium, sodium-extra, sound_physics_perfected, spanishdelight, storagedelight, superfastmath, supermartijn642corelib, tastyvanilla, timelesslib, trender, ubesdelight, untitledduckmod, vibrantparrots, voicechat, worldedit, worldeditcui, xaerolib, xaerominimap, xaeroworldmap, yet_another_config_lib_v3, file/Fire_Rekindled.zip, file/FreshAnimations_v1.10.5.zip, file/FA+All_Extensions-v1.9.2.zip, file/FA+Player-v1.0.zip, file/3D Vanilla v1.19.zip, fzmm:fzmm_default_heads, naturalwaters:opaque_water
>
>-- System Details --
>Details:
>	Minecraft Version: 26.1.2
>	Minecraft Version ID: 26.1.2
>	Operating System: Windows 11 (amd64) version 10.0
>	Java Version: 25.0.1, Oracle Corporation
>	Java VM Version: Java HotSpot(TM) 64-Bit Server VM (mixed mode), Oracle Corporation
>	Memory: 1132462080 bytes (1080 MiB) / 4294967296 bytes (4096 MiB) up to 4294967296 bytes (4096 MiB)
>	Memory (heap): init: 2048MiB, used: 3016MiB, committed: 4096MiB, max: 4096MiB
>	Memory (non-head): init: 007MiB, used: 447MiB, committed: 472MiB, max: 000MiB
>	CPUs: 16
>	Processor Vendor: GenuineIntel
>	Processor Name: 13th Gen Intel(R) Core(TM) i5-13450HX
>	Identifier: Intel64 Family 6 Model 183 Stepping 1
>	Microarchitecture: Raptor Lake
>	Frequency (GHz): 2.61
>	Number of physical packages: 1
>	Number of physical CPUs: 10
>	Number of logical CPUs: 16
>	Graphics card #0 name: Intel(R) UHD Graphics
>	Graphics card #0 vendor: Intel Corporation
>	Graphics card #0 VRAM (MiB): 2048.00
>	Graphics card #0 deviceId: VideoController1
>	Graphics card #0 versionInfo: 32.0.101.7026
>	Graphics card #1 name: NVIDIA GeForce RTX 4050 Laptop GPU
>	Graphics card #1 vendor: NVIDIA
>	Graphics card #1 VRAM (MiB): 6141.00
>	Graphics card #1 deviceId: VideoController2
>	Graphics card #1 versionInfo: 32.0.16.1062
>	Memory slot #0 capacity (MiB): 12288.00
>	Memory slot #0 clockSpeed (GHz): 4.80
>	Memory slot #0 type: DDR5
>	Memory slot #1 capacity (MiB): 12288.00
>	Memory slot #1 clockSpeed (GHz): 4.80
>	Memory slot #1 type: DDR5
>	Virtual memory max (MiB): 54046.40
>	Virtual memory used (MiB): 50059.94
>	Swap memory total (MiB): 29762.54
>	Swap memory used (MiB): 5129.26
>	Space in storage for jna.tmpdir (MiB): available: 214589.77, total: 476937.00
>	Space in storage for org.lwjgl.system.SharedLibraryExtractPath (MiB): available: 214589.77, total: 476937.00
>	Space in storage for io.netty.native.workdir (MiB): available: 214589.77, total: 476937.00
>	Space in storage for java.io.tmpdir (MiB): available: 47365.38, total: 486109.00
>	Space in storage for workdir (MiB): available: 214589.77, total: 476937.00
>	JVM Flags: 13 total; -XX:ThreadPriorityPolicy=1 -XX:+UnlockExperimentalVMOptions -XX:+EnableJVMCIProduct -XX:+EnableJVMCI -XX:-UnlockExperimentalVMOptions -XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump -Xss1M -Xms2G -Xmx4G -XX:+UseCompactObjectHeaders -XX:+AlwaysPreTouch -XX:+UseStringDeduplication -XX:+UseZGC
>	Debug Flags: 0 total; 
>	Fabric Mods: 
>		ali: AdvancedLootInfo 1.12.0
>		almanac: Almanac 1.6.2
>		ambientsounds: AmbientSounds 6.3.6
>		animalgarden_alligatorgar: Alligator Gar 1.0.0
>		animalgarden_bullshark: Animal Garden -Bull Shark 1.1.1
>		animalgarden_commonraven: animalgarden_commonraven 1.0.1
>		animalgarden_crocodile: animalgarden_crocodile 1.1.0
>		animalgarden_fennecfox: fennecfox 1.0.2
>		animalgarden_harpseal: animalgarden_harpseal 1.0.1
>		animalgarden_hippopotamus: animalgarden_hippopotamus 1.0.2
>		animalgarden_lion: animalgarden_lion 1.0.3
>		animalgarden_manatee: Animal Garden - Manatee 1.0.2
>		animalgarden_meerkat: Animal Garden - Meerkat 1.0.6
>		animalgarden_mouse: Animal Garden - Mouse 1.0.6
>		animalgarden_narwhal: animalgarden_narwhal 1.0.1
>		animalgarden_owl: Animal Garden - Owl 1.2.8
>		animalgarden_porcupine: Animal Garden - Porcupine 1.0.5
>		animalgarden_prairiedog: Animal Garden - Prairie Dog 1.0.3
>		animalgarden_redpanda: Animal Garden - Red Panda 1.1.3
>		animalgarden_redriverhog: animalgarden_redriverhog 1.0.0
>		animalgarden_seaotter: animalgarden_seaotter 1.1.1
>		animalgarden_snowleopard: animalgarden_snowleopard 1.0.1
>		animalgarden_spottedhyena: Animal Garden - Spotted Hyena 1.1.1
>		animalgarden_springhare: animalgarden_springhare 1.0.1
>		animalgarden_sugarglider: Animal Garden - Sugar Glider 1.0.1
>		animalgarden_vicuna: animalgarden_vicuna 1.0.1
>		animalgarden_westerngorilla: westerngorilla 1.0.1
>		animalgarden_whiterhinoceros: animalgarden-whiterhinoceros 1.0.1
>		animalgarden_yellowmongoose: Animal Garden - Yellow Mongoose 1.0.0
>		aquarius_libs: Aquarius Libs 1.2.0
>		async: Async 0.2.2+alpha-26.1.2
>			com_axalotl_async_api: api 1.0.1
>			fabric-permissions-api-v0: fabric-permissions-api 0.7.0
>		asyncparticles: AsyncParticles 26.1.0c-alpha.3
>		audioplayer: AudioPlayer 2.3.0+26.1.2
>			admiral: Admiral 0.4.10+26.1
>		beautify: Beautify 2.0.0+26.2
>		bettercapes: BetterCapes 1.5.1.1
>		betterrenderdistance: BetterRenderDistance 1.2.0
>		birds-boids: Birds Boids 1.3.1+26.1
>		boids: Boids 2.0.0+26.1
>		c2me: Concurrent Chunk Management Engine 0.4.0-alpha.0.31+26.1.2
>			c2me-base: Concurrent Chunk Management Engine (Base) 0.4.0-alpha.0.31+26.1.2
>			c2me-client-uncapvd: Concurrent Chunk Management Engine (Client/Uncap View Distance) 0.4.0-alpha.0.31+26.1.2
>			c2me-fixes-chunkio-threading-issues: Concurrent Chunk Management Engine (Fixes/Chunk IO/Threading Issues) 0.4.0-alpha.0.31+26.1.2
>			c2me-fixes-general-threading-issues: Concurrent Chunk Management Engine (Fixes/General/Threading Issues) 0.4.0-alpha.0.31+26.1.2
>			c2me-fixes-worldgen-threading-issues: Concurrent Chunk Management Engine (Fixes/WorldGen/Threading Issues) 0.4.0-alpha.0.31+26.1.2
>			c2me-fixes-worldgen-vanilla-bugs: Concurrent Chunk Management Engine (Fixes/WorldGen/Vanilla Bugs) 0.4.0-alpha.0.31+26.1.2
>			c2me-notickvd: Concurrent Chunk Management Engine (No Tick View Distance) 0.4.0-alpha.0.31+26.1.2
>			c2me-opts-allocs: Concurrent Chunk Management Engine (Optimizations/Memory Allocations) 0.4.0-alpha.0.31+26.1.2
>			c2me-opts-chunkio: Concurrent Chunk Management Engine (Optimizations/Chunk IO) 0.4.0-alpha.0.31+26.1.2
>			c2me-opts-dfc: Concurrent Chunk Management Engine (Optimizations/Density Function Compiler) 0.4.0-alpha.0.31+26.1.2
>			c2me-opts-math: Concurrent Chunk Management Engine (Optimizations/Math) 0.4.0-alpha.0.31+26.1.2
>			c2me-opts-natives-math: Concurrent Chunk Management Engine (Optimizations/Natives Math) 0.4.0-alpha.0.31+26.1.2
>			c2me-opts-scheduling: Concurrent Chunk Management Engine (Optimizations/Scheduling) 0.4.0-alpha.0.31+26.1.2
>			c2me-opts-worldgen-general: Concurrent Chunk Management Engine (Optimizations/General WorldGen) 0.4.0-alpha.0.31+26.1.2
>			c2me-opts-worldgen-vanilla: Concurrent Chunk Management Engine (Optimizations/Vanilla WorldGen) 0.4.0-alpha.0.31+26.1.2
>			c2me-rewrites-chunk-serializer: Concurrent Chunk Management Engine (Rewrites/Chunk Serializer) 0.4.0-alpha.0.31+26.1.2
>			c2me-rewrites-chunk-system: Concurrent Chunk Management Engine (Rewrites/Chunk System) 0.4.0-alpha.0.31+26.1.2
>			c2me-rewrites-chunkio: Concurrent Chunk Management Engine (Rewrites/Chunk IO) 0.4.0-alpha.0.31+26.1.2
>			c2me-server-utils: Concurrent Chunk Management Engine (Server Utils) 0.4.0-alpha.0.31+26.1.2
>			c2me-threading-lighting: Concurrent Chunk Management Engine (Threading/Lighting) 0.4.0-alpha.0.31+26.1.2
>			com_github_ben-manes_caffeine_caffeine: caffeine 3.2.1
>			com_ibm_async_asyncutil: asyncutil 0.1.0
>			com_ishland_c2me_tests_tests: tests 0.4.0-alpha.0.31
>			io_reactivex_rxjava3_rxjava: rxjava 3.1.12
>			mixinsquared: MixinSquared 0.3.7-beta.1
>			net_objecthunter_exp4j: exp4j 0.4.8
>			org_jctools_jctools-core: jctools-core 4.0.5
>			org_reactivestreams_reactive-streams: reactive-streams 1.0.4
>		camerautils: Camera Utils 1.1.2+26.1.2
>			fabric-key-mapping-api-v1: Fabric Key Mapping API (v1) 2.0.4+e2bdee7859
>		chatanimation: ChatAnimation 1.3.0
>		cicada: CICADA 0.15.2+26.1
>			org_yaml_snakeyaml: snakeyaml 2.2
>		cloth-config: Cloth Config v26.1 26.1.154
>			cloth-basic-math: cloth-basic-math 0.6.1
>		collective: Collective 8.32
>		configurable: Configurable 3.5.1
>			com_electronwill_night-config_core: core 3.8.3
>			com_electronwill_night-config_toml: toml 3.8.3
>			com_google_auto_service_auto-service: auto-service 1.0
>			org_quiltmc_parsers_gson: gson 0.3.1
>			org_quiltmc_parsers_json: json 0.3.1
>		connectedglass: Connected Glass 1.1.14
>		continuity: Continuity 3.0.1-beta.2+26.1
>		controlify: Controlify 3.0.2+26.1-fabric
>			dev_isxander_libsdl4j: libsdl4j 3.2.18.release-3.2.18-79
>			dev_isxander_steamdeck4j: steamdeck4j 1.1.7
>			org_hid4java_hid4java: hid4java 0.8.0
>		creativecore: CreativeCore 2.14.16
>			net_neoforged_bus: bus 7.2.0
>		cristellib: Cristel Lib 3.1.8
>			blue_endless_jankson: jankson 1.2.3
>		crittersandcompanions: Critters and Companions 26.1.2-0.2.3-fabric
>		cullleaves: Cull Leaves 4.1.2
>		cutthrough: Cut Through 26.1.0
>		dark-loading-screen: Dark Loading Screen 1.6.18
>		deermod: Deer Mod 0.7.0+26.1
>		delightlib: Delight Lib 26.5.18-26.1-fabric
>		displaydelight: Display Delight [Fabric] 1.8.2-mc26.1.2
>		do_a_barrel_roll: Do a Barrel Roll 3.8.4
>		doubledoors: Double Doors 7.2
>		dynamic_fps: Dynamic FPS 3.11.7
>			dynamic_fps_common: Dynamic FPS Common 3.11.7
>			net_lostluma_battery: battery 2.1.0
>		ecologics: Ecologics 2.5.3
>		electronic_device_mod: Electronic Device Mod 26.5.0
>		entity_model_features: Entity Model Features 3.2.4
>		entity_texture_features: Entity Texture Features 7.1
>		entityculling: EntityCulling 1.10.5
>			transition: TRansition 1.0.21
>			trender: TRender 1.0.15
>		evs: Enchanted Vertical Slabs 2.6.6
>		fabric-api: Fabric API 0.154.2+26.1.2
>			fabric-api-lookup-api-v1: Fabric API Lookup API (v1) 2.0.12+d5a053b64c
>			fabric-biome-api-v1: Fabric Biome API (v1) 18.0.5+2fa62b4e4c
>			fabric-block-api-v1: Fabric Block API (v1) 3.0.2+ec56b6014c
>			fabric-block-getter-api-v2: Fabric BlockGetter API (v2) 2.0.6+ec56b6014c
>			fabric-content-registries-v0: Fabric Content Registries (v0) 11.2.1+76b0b6bb4c
>			fabric-convention-tags-v2: Fabric Convention Tags (v2) 4.6.2+4f11f7994c
>			fabric-crash-report-info-v1: Fabric Crash Report Info (v1) 1.0.3+9f78a5a84c
>			fabric-creative-tab-api-v1: Fabric Creative Tab API (v1) 5.0.11+d871b99e4c
>			fabric-data-attachment-api-v1: Fabric Data Attachment API (v1) 2.2.9+44a0bd1d4c
>			fabric-data-generation-api-v1: Fabric Data Generation API (v1) 24.3.2+574cf22d4c
>			fabric-debug-api-v1: Fabric Debug API (v1) 1.0.1+c792624d4c
>			fabric-dimensions-v1: Fabric Dimensions API (v1) 5.1.6+9cbf5da54c
>			fabric-entity-events-v1: Fabric Entity Events (v1) 5.0.2+e2bdee784c
>			fabric-events-interaction-v0: Fabric Events Interaction (v0) 5.2.2+07b380be4c
>			fabric-game-rule-api-v1: Fabric Game Rule API (v1) 4.0.5+d871b99e4c
>			fabric-item-api-v1: Fabric Item API (v1) 14.2.0+a2a3a8914c
>			fabric-lifecycle-events-v1: Fabric Lifecycle Events (v1) 4.1.1+df84eb3d4c
>			fabric-loot-api-v3: Fabric Loot API (v3) 3.0.12+00a1fba64c
>			fabric-menu-api-v1: Fabric Menu API (v1) 2.0.14+d871b99e4c
>			fabric-message-api-v1: Fabric Message API (v1) 7.0.5+dae8ce3e4c
>			fabric-model-loading-api-v1: Fabric Model Loading API (v1) 8.0.11+c80601bb4c
>			fabric-networking-api-v1: Fabric Networking API (v1) 6.3.1+554860db4c
>			fabric-object-builder-api-v1: Fabric Object Builder API (v1) 23.1.0+abb459f14c
>			fabric-particles-v1: Fabric Particles (v1) 5.0.15+b61fef434c
>			fabric-permission-api-v1: Fabric Permission API (v1) 1.0.2+7437387b4c
>			fabric-recipe-api-v1: Fabric Recipe API (v1) 9.0.16+be4b75ae4c
>			fabric-registry-sync-v0: Fabric Registry Sync (v0) 7.1.0+2fa62b4e4c
>			fabric-renderer-api-v1: Fabric Renderer API (v1) 13.0.8+c80601bb4c
>			fabric-renderer-indigo: Fabric Renderer - Indigo 8.1.5+1403e82c4c
>			fabric-rendering-fluids-v1: Fabric Rendering Fluids (v1) 6.0.1+d871b99e4c
>			fabric-rendering-v1: Fabric Rendering (v1) 23.3.1+e9207d814c
>			fabric-resource-conditions-api-v1: Fabric Resource Conditions API (v1) 6.1.0+83dd0ba34c
>			fabric-resource-loader-v0: Fabric Resource Loader (v0) 3.3.17+4fc5413f4c
>			fabric-resource-loader-v1: Fabric Resource Loader (v1) 2.0.10+7c44c7324c
>			fabric-screen-api-v1: Fabric Screen API (v1) 5.1.0+981dd9b24c
>			fabric-serialization-api-v1: Fabric Serialization API (v1) 2.0.3+11a26f314c
>			fabric-sound-api-v1: Fabric Sound API (v1) 2.0.4+11a26f314c
>			fabric-tag-api-v1: Fabric Tag API (v1) 2.1.1+371cf5db4c
>			fabric-transfer-api-v1: Fabric Transfer API (v1) 8.0.6+357ea7334c
>			fabric-transitive-access-wideners-v1: Fabric Transitive Access Wideners (v1) 8.1.3+3ff549fb4c
>		fabric-language-kotlin: Fabric Language Kotlin 1.13.12+kotlin.2.4.0
>			org_jetbrains_kotlin_kotlin-reflect: kotlin-reflect 2.4.0
>			org_jetbrains_kotlin_kotlin-stdlib: kotlin-stdlib 2.4.0
>			org_jetbrains_kotlin_kotlin-stdlib-jdk7: kotlin-stdlib-jdk7 2.4.0
>			org_jetbrains_kotlin_kotlin-stdlib-jdk8: kotlin-stdlib-jdk8 2.4.0
>			org_jetbrains_kotlinx_atomicfu-jvm: atomicfu-jvm 0.33.0
>			org_jetbrains_kotlinx_kotlinx-coroutines-core-jvm: kotlinx-coroutines-core-jvm 1.11.0
>			org_jetbrains_kotlinx_kotlinx-coroutines-jdk8: kotlinx-coroutines-jdk8 1.11.0
>			org_jetbrains_kotlinx_kotlinx-datetime-jvm: kotlinx-datetime-jvm 0.8.0
>			org_jetbrains_kotlinx_kotlinx-io-bytestring-jvm: kotlinx-io-bytestring-jvm 0.9.0
>			org_jetbrains_kotlinx_kotlinx-io-core-jvm: kotlinx-io-core-jvm 0.9.0
>			org_jetbrains_kotlinx_kotlinx-serialization-cbor-jvm: kotlinx-serialization-cbor-jvm 1.11.0
>			org_jetbrains_kotlinx_kotlinx-serialization-core-jvm: kotlinx-serialization-core-jvm 1.11.0
>			org_jetbrains_kotlinx_kotlinx-serialization-json-jvm: kotlinx-serialization-json-jvm 1.11.0
>		fabricloader: Fabric Loader 0.19.3
>			mixinextras: MixinExtras 0.5.4
>		fallingleavesplus: Falling Leaves Plus 26.1.0
>		fancy-door-anim: Fancy Door Animations 1.4.0
>		farmersdelight: Farmer's Delight 26.1-3.6.7+refabricated
>		fastipping: Fast IP Ping 1.0.11
>		ferritecore: FerriteCore 9.0.0
>		forgeconfigapiport: Forge Config API Port 26.1.5
>		framework: Framework 0.13.23
>			org_javassist_javassist: javassist 3.30.2-GA
>			org_reflections_reflections: reflections 0.10.2
>		fusion: Fusion 1.3.5
>		fzmm: FZMM 0.2.20
>		fzzy_config: Fzzy Config 0.7.6+26.1
>			net_peanuuutz_tomlkt_tomlkt-jvm: tomlkt-jvm 0.3.7
>		geckolib: GeckoLib 5 5.5.1
>		gnetum: Gnetum 4.4.1+26.1.2-fabric
>		immediatelyfast: ImmediatelyFast 1.15.3+26.1
>			net_lenni0451_reflect: Reflect 1.6.2
>		immersivethunder: ImmersiveThunder: Reforged 1.3.5+26.1.x
>		iris: Iris 1.11.2+mc26.1.2
>			io_github_douira_glsl-transformer: glsl-transformer 3.0.0-pre3
>			org_anarres_jcpp: jcpp 1.4.14
>			org_antlr_antlr4-runtime: antlr4-runtime 4.13.1
>		ixeris: Ixeris 4.5.2+26.1.2-fabric
>		java: Java HotSpot(TM) 64-Bit Server VM 25
>		jei: Just Enough Items 29.13.0.42
>		khazodacore: KhazodaCore 1.0.2+26.1
>		krypton: Krypton 0.3.0
>			com_velocitypowered_velocity-native: velocity-native 3.4.0-SNAPSHOT
>		letmedespawn: LetMeDespawn 1.6.2
>		lithium: Lithium 0.24.6+mc26.1.2
>		lithostitched: Lithostitched 1.7.13
>		mcwbridges: Macaw's Bridges 3.1.2
>		mcwdoors: Macaw's Doors 1.1.5
>		mcwfences: Macaw's Fences and Walls 1.2.1
>		mcwfurnitures: Macaw's Furniture 3.4.2
>		mcwholidays: Macaw's Holidays 1.1.2
>		mcwlights: Macaw's Lights and Lamps 1.1.5
>		mcwroofs: Macaw's Roofs 2.3.2
>		mcwstairs: Macaw's Stairs and Balconies 1.0.2
>		mcwtrpdoors: Macaw's Trapdoors 1.1.5
>		mcwwindows: Macaw's Windows 2.4.2
>		mdm: ModernDecorMod 26.5.1
>		midnightlib: MidnightLib 1.9.3
>		mindfuldarkness: Mindful Darkness 26.1.0
>		minecraft: Minecraft 26.1.2
>		modernfix: ModernFix 5.27.19-build.1
>		modmenu: Mod Menu 18.0.0
>			placeholder-api: Placeholder API 3.0.0+26.1
>		moreculling: More Culling 1.7.2
>			conditional-mixin: conditional mixin 0.6.3
>		moredelight: More Delight 26.5.26-26.1-fabric
>		mr_2032_worldheight: 2032 World Height 1.3+datapack
>		naturalwaters: Natural Waters 26.1.1
>		neruina: Neruina 3.3.1
>			org_apache_httpcomponents_httpclient: httpclient 4.5
>			org_apache_httpcomponents_httpcore: httpcore 4.4
>			org_kohsuke_github-api: github-api 2.0-rc.6
>		owo: oωo 0.13.0+26.1
>			com_github_kdl-org_kdl4j: kdl4j 1.0.1
>			io_wispforest_endec: endec 0.1.12
>			io_wispforest_endec_gson: gson 0.1.7
>			io_wispforest_endec_jankson: jankson 0.1.7
>			io_wispforest_endec_netty: netty 0.1.6
>		packetfixer: Packet Fixer 3.3.5
>		particlerain: Particle Rain 4.0.0-beta.10
>		picturemode: Picture Mode 1.1.6+26.1
>		pingview: Ping View 1.6
>		pixelshot: Pixelshot 26.1.0
>		placeable_food: 3D Placeable food 3.0.2
>		plushables: Plushables 2.5.1+26.1
>		pneumonocore: PneumonoCore 1.3.1
>		polymer-bundled: Polymer 0.16.5+26.1.2
>			polymer-autohost: Polymer (Auto Host) 0.16.5+26.1.2
>			polymer-blocks: Polymer (Textured Blocks) 0.16.5+26.1.2
>			polymer-common: Polymer (Common) 0.16.5+26.1.2
>			polymer-core: Polymer (Core) 0.16.5+26.1.2
>				polymer-networking: Polymer (Networking) 0.16.5+26.1.2
>				polymer-registry-sync-manipulator: Polymer (Registry Sync Manipulator) 0.16.5+26.1.2
>			polymer-resource-pack: Polymer (Resource Pack) 0.16.5+26.1.2
>			polymer-resource-pack-extras: Polymer (Resource Pack Extras) 0.16.5+26.1.2
>			polymer-sound-patcher: Polymer (Sound Patcher) 0.16.5+26.1.2
>			polymer-virtual-entity: Polymer (Virtual Entity) 0.16.5+26.1.2
>		polymer-qol: polymer-qol 1.0.2+26.1
>		presencefootsteps: Presence Footsteps 1.13.3+26.1
>			kirin: Kirin UI 1.22.0-beta.1+26.1
>		ptsdeco: PTS-Deco 9.0
>		puzzleslib: Puzzles Lib 26.1.11
>		realisticbees: Realistic Bees 4.3
>		refurbished_furniture: MrCrayfish's Furniture Mod: Refurbished 1.0.23
>		resourcify: Resourcify 1.8.3
>		rusticdelight: Rustic Delight 1.6.0
>		scalablelux: ScalableLux 0.3.0-alpha.0.2+26.1.2
>		sealife: Sea Life 26.1.1
>		shouldercats: Shoulder Cats 2.0+mc26.1.2
>		simplycozyenchantmentlib: simplycozy enchantment lib 1.1.0
>		simplycozymod: simplycozymod 1.0.0
>			javazoom_jlayer: jlayer 1.0.1
>		simplyweapons: simplyweapons 1.0.0
>		skinlayers3d: 3d-Skin-Layers 1.11.2
>		skinrestorer: SkinRestorer 2.9.0+26.1-fabric
>			org_mineskin_java-client: java-client 3.2.1-SNAPSHOT
>		skniro_furniture: skniro's Furniture 1.5.0-26.1-Fabric
>		sodium: Sodium 0.9.1+mc26.1.2
>		sodium-extra: Sodium Extra 0.9.3+mc26.1.2
>			me_flashyreese_mods_greenlight-api: greenlight-api 0.1.0+mc26.2
>		sound_physics_perfected: Sound Physics Perfected 1.17.3
>		spanishdelight: Spanish Delight Refabricated 26.1.2-1.0.10
>		storagedelight: Storage Delight 26.7.1-26.1-fabric
>		superfastmath: SuperFastMath 0.0.4-26.1.2
>			org_apache_commons_commons-math3: commons-math3 3.6.1
>		supermartijn642corelib: SuperMartijn642's Core Lib 1.1.21+a
>		tastyvanilla: TastyVanilla 2.1.2
>		timelesslib: TimelessLib 2.0.0-fabric-26.1
>		ubesdelight: Ube's Delight 0.4.14
>		untitledduckmod: UntitledDuck 1.5.6
>		vibrantparrots: Vibrant Parrots 26.1.1
>		visualjukebox: VisualJukebox 1.1.1+26.1
>		voicechat: Simple Voice Chat 2.6.20+26.1.2
>			fabric-api-base: Fabric API Base 2.0.3+ece0632347
>			fabric-command-api-v2: Fabric Command API (v2) 3.0.5+e2bdee7847
>			voicechat_api: Simple Voice Chat API 2.6.20
>		worldedit: WorldEdit 7.4.3+7515-78babeb
>		worldeditcui: WorldEditCUI 26.1.1+01
>			worldeditcui_protocol: WorldEditCUI Protocol (Fabric) 4.0.3
>		xaerominimap: Xaero's Minimap 26.2.0
>			xaerolib: XaeroLib 1.5.0
>		xaeroworldmap: Xaero's World Map 1.42.0
>		yet_another_config_lib_v3: YetAnotherConfigLib 3.9.4+26.1-fabric
>			com_twelvemonkeys_common_common-image: common-image 3.12.0
>			com_twelvemonkeys_common_common-io: common-io 3.12.0
>			com_twelvemonkeys_common_common-lang: common-lang 3.12.0
>			com_twelvemonkeys_imageio_imageio-core: imageio-core 3.12.0
>			com_twelvemonkeys_imageio_imageio-metadata: imageio-metadata 3.12.0
>			com_twelvemonkeys_imageio_imageio-webp: imageio-webp 3.12.0
>	Loaded Shaderpack: (off)
>	Launched Version: fabric-loader-0.19.3-26.1.2
>	Launcher name: minecraft-launcher
>	Backend library: LWJGL version 3.4.1-snapshot
>	Backend API: NVIDIA GeForce RTX 4050 Laptop GPU/PCIe/SSE2 GL version 4.6.0 NVIDIA 610.62, NVIDIA Corporation
>	Window size: 854x480
>	GFLW Platform: win32
>	Render Extensions: GL_ARB_buffer_storage, GL_KHR_debug, GL_ARB_vertex_attrib_binding, GL_ARB_direct_state_access, GL_EXT_texture_filter_anisotropic
>	GL debug messages: 
>	Is Modded: Definitely; Client brand changed to 'fabric'; Server brand changed to 'fabric'
>	Universe: 400921fb54442d18
>	Type: Integrated Server
>	Transparency: regular
>	Render Distance: 8/8 chunks
>	Resource Packs: vanilla, ali (incompatible), almanac, ambientsounds, animalgarden_alligatorgar, animalgarden_bullshark, animalgarden_commonraven, animalgarden_crocodile, animalgarden_fennecfox, animalgarden_harpseal, animalgarden_hippopotamus, animalgarden_lion, animalgarden_manatee, animalgarden_meerkat, animalgarden_mouse, animalgarden_narwhal, animalgarden_owl, animalgarden_porcupine, animalgarden_prairiedog, animalgarden_redpanda, animalgarden_redriverhog, animalgarden_seaotter, animalgarden_snowleopard, animalgarden_spottedhyena, animalgarden_springhare, animalgarden_sugarglider, animalgarden_vicuna, animalgarden_westerngorilla, animalgarden_whiterhinoceros, animalgarden_yellowmongoose, aquarius_libs, asyncparticles (incompatible), audioplayer, beautify, bettercapes, betterrenderdistance, birds-boids, boids, c2me, camerautils, chatanimation, cicada, cloth-config, collective (incompatible), conditional-mixin, configurable (incompatible), connectedglass, continuity, controlify, creativecore, cristellib, crittersandcompanions, cullleaves (incompatible), dark-loading-screen, deermod, delightlib (incompatible), displaydelight, do_a_barrel_roll (incompatible), dynamic_fps, dynamic_fps_common, ecologics (incompatible), electronic_device_mod (incompatible), entity_model_features (incompatible), entity_texture_features (incompatible), entityculling, evs, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-getter-api-v2, fabric-command-api-v2, fabric-content-registries-v0, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-creative-tab-api-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-debug-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-item-api-v1, fabric-key-mapping-api-v1, fabric-language-kotlin, fabric-lifecycle-events-v1, fabric-loot-api-v3, fabric-menu-api-v1, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-permission-api-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-resource-loader-v1, fabric-screen-api-v1, fabric-serialization-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, fallingleavesplus (incompatible), fancy-door-anim, farmersdelight, forgeconfigapiport (incompatible), framework (incompatible), fusion, fzmm, fzzy_config, gnetum, immediatelyfast, immersivethunder (incompatible), iris, jei (incompatible), kirin, krypton, letmedespawn, lithium, mcwbridges (incompatible), mcwdoors (incompatible), mcwfences (incompatible), mcwfurnitures (incompatible), mcwholidays (incompatible), mcwlights (incompatible), mcwroofs (incompatible), mcwstairs (incompatible), mcwtrpdoors (incompatible), mcwwindows (incompatible), mdm (incompatible), midnightlib, mindfuldarkness (incompatible), modernfix (incompatible), modmenu, moreculling, moredelight, naturalwaters (incompatible), neruina (incompatible), org_apache_commons_commons-math3, owo, particlerain (incompatible), picturemode, pingview, pixelshot (incompatible), placeable_food (incompatible), placeholder-api, plushables (incompatible), pneumonocore, polymer-blocks, polymer-core, polymer-qol, polymer-resource-pack, presencefootsteps, ptsdeco (incompatible), realisticbees (incompatible), refurbished_furniture (incompatible), resourcify (incompatible), rusticdelight, scalablelux, sealife (incompatible), shouldercats, simplycozyenchantmentlib, simplycozymod, simplyweapons, skinlayers3d, skinrestorer (incompatible), skniro_furniture (incompatible), sodium, sodium-extra, sound_physics_perfected (incompatible), spanishdelight, storagedelight, superfastmath, supermartijn642corelib, tastyvanilla, timelesslib, trender, ubesdelight, untitledduckmod (incompatible), vibrantparrots (incompatible), voicechat, worldedit (incompatible), worldeditcui, xaerolib (incompatible), xaerominimap (incompatible), xaeroworldmap (incompatible), yet_another_config_lib_v3 (incompatible), file/Fire_Rekindled.zip, file/FreshAnimations_v1.10.5.zip, file/FA+All_Extensions-v1.9.2.zip, file/FA+Player-v1.0.zip, file/3D Vanilla v1.19.zip, fzmm:fzmm_default_heads, naturalwaters:opaque_water
>	Sound Cache: 48816 bytes in 1 buffers
>	Current Language: en_gb
>	Locale: en_IN
>	System encoding: UTF-8
>	File encoding: UTF-8
>	CPU: 16x 13th Gen Intel(R) Core(TM) i5-13450HX
>	Server Running: true
>	Player Count: 1 / 8; [ServerPlayer['CorruptShade'/291, l='ServerLevel[Bagger 288]', x=63.30, y=18.49, z=156.96, removed=UNLOADED_WITH_PLAYER]]
>	Active Data Packs: vanilla, ali (incompatible), animalgarden_alligatorgar, animalgarden_bullshark, animalgarden_commonraven, animalgarden_crocodile, animalgarden_fennecfox, animalgarden_harpseal, animalgarden_hippopotamus, animalgarden_lion, animalgarden_manatee, animalgarden_meerkat, animalgarden_mouse, animalgarden_narwhal, animalgarden_owl, animalgarden_porcupine, animalgarden_prairiedog, animalgarden_redpanda, animalgarden_redriverhog, animalgarden_seaotter, animalgarden_snowleopard, animalgarden_spottedhyena, animalgarden_springhare, animalgarden_sugarglider, animalgarden_vicuna, animalgarden_westerngorilla, animalgarden_whiterhinoceros, animalgarden_yellowmongoose, audioplayer, beautify, birds-boids, collective, connectedglass, crittersandcompanions, deermod, displaydelight, ecologics (incompatible), electronic_device_mod (incompatible), evs, fabric-convention-tags-v2, farmersdelight, lithostitched (incompatible), mcwbridges, mcwdoors, mcwfences, mcwfurnitures, mcwholidays, mcwlights, mcwroofs, mcwstairs, mcwtrpdoors, mcwwindows, mdm (incompatible), moredelight, mr_2032_worldheight, neruina, picturemode, placeable_food (incompatible), plushables (incompatible), ptsdeco (incompatible), refurbished_furniture (incompatible), rusticdelight, sealife, simplycozymod, simplyweapons, skniro_furniture (incompatible), spanishdelight, storagedelight, supermartijn642corelib, tastyvanilla, ubesdelight, untitledduckmod (incompatible), vibrantparrots
>	Available Data Packs: ali (incompatible), animalgarden_alligatorgar, animalgarden_bullshark, animalgarden_commonraven, animalgarden_crocodile, animalgarden_fennecfox, animalgarden_harpseal, animalgarden_hippopotamus, animalgarden_lion, animalgarden_manatee, animalgarden_meerkat, animalgarden_mouse, animalgarden_narwhal, animalgarden_owl, animalgarden_porcupine, animalgarden_prairiedog, animalgarden_redpanda, animalgarden_redriverhog, animalgarden_seaotter, animalgarden_snowleopard, animalgarden_spottedhyena, animalgarden_springhare, animalgarden_sugarglider, animalgarden_vicuna, animalgarden_westerngorilla, animalgarden_whiterhinoceros, animalgarden_yellowmongoose, audioplayer, beautify, birds-boids, collective, connectedglass, crittersandcompanions, deermod, displaydelight, ecologics (incompatible), electronic_device_mod (incompatible), evs, fabric-convention-tags-v2, farmersdelight, lithostitched (incompatible), mcwbridges, mcwdoors, mcwfences, mcwfurnitures, mcwholidays, mcwlights, mcwroofs, mcwstairs, mcwtrpdoors, mcwwindows, mdm (incompatible), minecart_improvements, moredelight, mr_2032_worldheight, neruina, picturemode, placeable_food (incompatible), plushables (incompatible), ptsdeco (incompatible), redstone_experiments, refurbished_furniture (incompatible), rusticdelight, sealife, simplycozymod, simplyweapons, skniro_furniture (incompatible), spanishdelight, storagedelight, supermartijn642corelib, tastyvanilla, trade_rebalance, ubesdelight, untitledduckmod (incompatible), vanilla, vibrantparrots
>	Enabled Feature Flags: minecraft:vanilla
>	World Generation: Stable
>	World Seed: -2359552446382391972
>	Suppressed Exceptions: ~~NONE~~
>```
>
>### Additional context
>
>_No response_
