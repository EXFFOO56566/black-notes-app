.class public final Lcom/google/android/gms/auth/api/signin/internal/w;
.super Lcom/google/android/gms/auth/api/signin/internal/q;
.source ""


# instance fields
.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/internal/q;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/internal/w;->b:Landroid/content/Context;

    return-void
.end method

.method private final r0()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/w;->b:Landroid/content/Context;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/util/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/SecurityException;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    const/16 v2, 0x34

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Calling UID "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " is not Google Play services."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final X0()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/internal/w;->r0()V

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/w;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/internal/c;->a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/c;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->p:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/c;->c()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/w;->b:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/google/android/gms/auth/api/signin/a;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/b;

    move-result-object v0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/b;->g()Lb/c/b/a/h/f;

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/b;->h()Lb/c/b/a/h/f;

    return-void
.end method

.method public final e0()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/internal/w;->r0()V

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/w;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/internal/o;->a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/o;->a()V

    return-void
.end method
