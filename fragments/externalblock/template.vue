<template>
  <div v-bind:data-per-path="model.path">
    <a v-bind:href="model.url">
      <h2>{{model.title}}</h2>
    </a>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

