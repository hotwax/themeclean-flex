<template>
  <div v-bind:data-per-path="model.path">
    <div v-for="(item,i) in model.links" :key="i">

    <div v-if="item.internallink.length > 0">
     <a v-bind:href="item.internallink"><p v-html="item.title"></p></a>
    </div>
    <div v-else>
    <a v-bind:href="item.externalurl"><p v-html="item.title"></p></a>
    </div>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

