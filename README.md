## Craftok Private API

API officiel de Craftok, ce projet n'est pour le moment pas public.

## Java Code Rules
Cette intégration doit respecter les standards de développement d'Oracle ainsi que Google.  
[Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)  
[Oracle Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)

## Api

Ce module contient l'ensemble des interfaces pour interagir indirectement avec les bases de données. Un wiki est envisageable dans le futur.

Veuillez ne creer qu'une seule instance de l'Api au sein de votre projet.

### Utilisation de l'Api avec Bukkit ServicesManager

```java
RegisteredServiceProvider<CraftokApi> service = Bukkit.getServicesManager().getRegistration(CraftokApi.class);
if (service != null) {
    CraftokApi api = service.getProvider();
}
```

### Utilisation du singleton

```java
Craftok api = CraftokProvider.getApi();
```

## Information / Under heavy development

Ceci est une api encore en développement et subira de lourdes modifications dans le futur proche et sera adapté au Network! 

### Recuperation et Utilisation d'un User

```java
UserManager userManager = api.getUserManager();

//Recuperer un utilisateur via son UUID

User user = userManager.getUser(uuid);

user.addCoins(10);

//Permet de save un user modifié
userManager.saveUser(user);

//Recuperer un utilisateur via son IGN

Optional<User> optional = userManager.getUserByName(name);

if (optional.isPresent) {
    optional.get().getFirstJoin();
}

//Recuperation avancee d'un utilisateur (update du schema, verification de presence)

User user = userManager.loadUser(uuid);
```

### Recuperation d'un Group  

```java
GroupManager groupManager = api.getGroupManager();

//Recuperer un group via son ID (string)

Group group = groupManager.getGroup(groupId);

//Recuperer le group d'un utilisateur

groupManager.getUserGroup(uuid);

//Verifier si un group possede une permission
        
Arrays.stream(group.getPermissions()).anyMatch(permission -> permission.getKey().equalsIgnoreCase("perm") && permission.getValue());
```

