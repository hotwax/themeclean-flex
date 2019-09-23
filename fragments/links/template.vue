<template>
  <div v-bind:data-per-path="model.path">
    <div v-for="(item,i) in model.links" :key="i">
      <a href v-html="href"></a>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

