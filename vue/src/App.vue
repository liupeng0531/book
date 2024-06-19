<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
import Index from "@/components/Index";
export default {
  name: "App",
  components: {
    Index
  },
}
</script>

<style lang="less">
#app {
  height: 100%;
}
</style>
