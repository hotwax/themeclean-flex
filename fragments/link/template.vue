<template>
  <div v-bind:data-per-path="model.path">
    <a v-bind:href="model.link"><p v-html="model.title"></p></a>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

