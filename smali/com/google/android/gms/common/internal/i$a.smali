.class public final Lcom/google/android/gms/common/internal/i$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/internal/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "a"
.end annotation


# static fields
.field private static final f:Landroid/net/Uri;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/content/ComponentName;

.field private final d:I

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "content"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "com.google.android.gms.chimera"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/common/internal/i$a;->f:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/r;->b(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/common/internal/i$a;->a:Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/r;->b(Ljava/lang/String;)Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/common/internal/i$a;->b:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/i$a;->c:Landroid/content/ComponentName;

    iput p3, p0, Lcom/google/android/gms/common/internal/i$a;->d:I

    iput-boolean p4, p0, Lcom/google/android/gms/common/internal/i$a;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/i$a;->c:Landroid/content/ComponentName;

    return-object v0
.end method

.method public final a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/common/internal/i$a;->a:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/common/internal/i$a;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/common/internal/i$a;->a:Ljava/lang/String;

    const-string v3, "serviceActionBundleKey"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    sget-object v2, Lcom/google/android/gms/common/internal/i$a;->f:Landroid/net/Uri;

    const-string v3, "serviceIntentCall"

    invoke-virtual {p1, v2, v3, v1, v0}, Landroid/content/ContentResolver;->call(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "serviceResponseIntentKey"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    move-object v1, p1

    :goto_0
    if-nez v1, :cond_2

    const-string p1, "Dynamic lookup for intent failed for action: "

    iget-object v0, p0, Lcom/google/android/gms/common/internal/i$a;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v0

    :goto_1
    const-string v0, "ConnectionStatusConfig"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    if-nez v1, :cond_4

    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/common/internal/i$a;->a:Ljava/lang/String;

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/common/internal/i$a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    goto :goto_2

    :cond_3
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/common/internal/i$a;->c:Landroid/content/ComponentName;

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v1

    :cond_4
    :goto_2
    return-object v1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/i$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/internal/i$a;->d:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/common/internal/i$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/common/internal/i$a;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/i$a;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/common/internal/i$a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/internal/i$a;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/common/internal/i$a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/internal/i$a;->c:Landroid/content/ComponentName;

    iget-object v3, p1, Lcom/google/android/gms/common/internal/i$a;->c:Landroid/content/ComponentName;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/common/internal/i$a;->d:I

    iget v3, p1, Lcom/google/android/gms/common/internal/i$a;->d:I

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lcom/google/android/gms/common/internal/i$a;->e:Z

    iget-boolean p1, p1, Lcom/google/android/gms/common/internal/i$a;->e:Z

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/i$a;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/common/internal/i$a;->b:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/common/internal/i$a;->c:Landroid/content/ComponentName;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget v1, p0, Lcom/google/android/gms/common/internal/i$a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lcom/google/android/gms/common/internal/i$a;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/google/android/gms/common/internal/p;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/i$a;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/internal/i$a;->c:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
