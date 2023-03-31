.class final Lcom/google/android/gms/internal/ads/p52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/l52;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/l52;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p52;->b:Lcom/google/android/gms/internal/ads/l52;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p52;->b:Lcom/google/android/gms/internal/ads/l52;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/l52;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zr2;->a(Landroid/content/Context;)V

    return-void
.end method
